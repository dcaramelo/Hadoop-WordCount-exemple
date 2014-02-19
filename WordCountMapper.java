import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    String l = value.toString();
    
    for (String w : l.split("\\W+")) {
    	if (w.length() > 0)
    		context.write(new Text(w.toLowerCase()), new IntWritable(1));
    }

  }
}
