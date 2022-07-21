package Collection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVExample2
{
    public static void main(String[] args)
    {
        String line = "";
        String splitBy = ",";
        try
        {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/home/harshavardhan/Downloads/annual-enterprise-survey-2020-financial-year-provisional-csv.csv"));
            CSVReader csvReader = new CSVReader(filereader);
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                //System.out.println("Industry [Year=" + employee[0] + ", Industry_aggregation_NZSIOC=" + employee[1] + ", Industry_code_NZSIOC=" + employee[2] + ", Industry_name_NZSIOC =" + employee[3] + ", Units = " + employee[4] + ", Variable_code= " + employee[5] + "Variable_name"+ employee[6]+"Variable_category"+ employee[7]+"Value"+ employee[8]+"Industry_code_ANZSIC06"+ employee[9]+"]");
                //System.out.println("years="+employee[0]);
                Industry op = new Industry();
                op.list.add(new Industry(employee[0],employee[1],employee[2],employee[3],employee[4]));
                System.out.println(op.list.get(0));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
class Industry{
    String year;
    String industry_aggregation_NZSIOC;
    String industry_code_NZSIOC;
    String industry_name_NZSIOC;
    String units;
    List<Industry> list =new  ArrayList<>();

    public Industry(String year,String industry_aggregation_NZSIOC,String industry_code_NZSIOC,String industry_name_NZSIOC,String units){
        this.year=year;
        this.industry_aggregation_NZSIOC=industry_aggregation_NZSIOC;
        this.industry_code_NZSIOC=industry_code_NZSIOC;
        this.industry_name_NZSIOC=industry_name_NZSIOC;
        this.units=units;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "year='" + year + '\'' +
                ", industry_aggregation_NZSIOC='" + industry_aggregation_NZSIOC + '\'' +
                ", industry_code_NZSIOC='" + industry_code_NZSIOC + '\'' +
                ", industry_name_NZSIOC='" + industry_name_NZSIOC + '\'' +
                ", units='" + units + '\'' +
                ", list=" + list +
                '}';
    }

    public Industry() {
    }
}