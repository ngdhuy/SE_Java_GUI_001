package Calculator.models;

/**
 * Calculator.models
 * Created by ndhuy
 * Date 28/09/2021 - 23:08
 * Description: ...
 */
public class CalculateNumber {
    private String value;
    private String memory;
    private boolean isMemory;
    private boolean isDecimal;
    private Operator operator;

    public CalculateNumber() {
        this.value = "0";
        this.memory = "0";
        this.isMemory = false;
        this.isDecimal = false;
        this.operator = Operator.NONE;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String  value) {
        this.value = value;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(boolean memory) {
        this.isMemory = memory;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void pushNumber(int value)
    {
        if (this.value == "0")
            this.value = Integer.toString(value);
        else
            this.value = this.value + value;
    }

    @Override
    public String toString() {
        if (!this.isDecimal)
            return this.value + ".";
        else
            return this.value;
    }

    public void clear() {
        this.value = "0";
        this.memory = "0";
        this.isMemory = false;
        this.isDecimal = false;
    }

    public void setNegative() {
        if(!this.isDecimal) {
            Integer value = Integer.parseInt(this.value);
            value *= -1;
            this.value = value.toString();
        } else {
            Double value = Double.parseDouble(this.value);
            value *= -1;
            this.value = value.toString();
        }
    }

    public void setPercent() {
        if(this.isDecimal) {
            Integer value = Integer.parseInt(this.value);
            value /= 100;
            this.value = value.toString();
        } else {
            Double value = Double.parseDouble(this.value);
            value /= 100;
            this.value = value.toString();
        }
    }

    public void divide() {
        this.memory = this.value;
        this.value = "0";
        this.isMemory = true;
        this.operator = Operator.DIVIDE;
    }

    public void multi() {
        this.memory = this.value;
        this.value = "0";
        this.isMemory = true;
        this.operator = Operator.MULTI;
    }

    public void minus() {
        this.memory = this.value;
        this.value = "0";
        this.isMemory = true;
        this.operator = Operator.MINUS;
    }

    public void plus() {
        this.memory = this.value;
        this.value = "0";
        this.isMemory = true;
        this.operator = Operator.PLUS;
    }

    public void setDecimal() {
        this.isDecimal = true;
        this.value += ".";
    }

    public void calculator() {
        Double value = Double.parseDouble(this.value);
        Double memory = Double.parseDouble(this.memory);
        Double result;
        switch (this.operator) {
            case PLUS:
                result = value + memory;
                this.value = result.toString();
                break;
            case MINUS:
                result = value - memory;
                this.value = result.toString();
                break;
            case MULTI:
                result = value * memory;
                this.value = result.toString();
                break;
            case DIVIDE:
                result = value / memory;
                this.value = result.toString();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + this.operator);
        }
        if(Math.round(result) == result)
            this.value = this.value.substring(0, this.value.length() - 2);
    }
}
