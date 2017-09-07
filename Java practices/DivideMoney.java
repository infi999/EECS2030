package A2;

public class DivideMoney {
	private int[] divider = new int[]{1, 5, 10, 25};
	  
	  private static int k = 1;
	  
	  public static void main(String[] args) {
	    DivideMoney divideMoney = new DivideMoney();
	    System.out.println(divideMoney.divider( k));
	  }
	  
	  public int divider(int num){
	    return divider(num, divider[divider.length-1]);
	  }
	  
	  /**
	   * 
	   * 
	   * @author Sun Tao
	   * @param num 分配的钱的总数，例如此例的17
	   * @param dividerNum 分配的最大的钱币的数量，例如此例为25
	   * @return
	   */
	  public int divider(int num, int dividerNum){
	    int result = 0;
	    //如果只用1分钱来分的话，那么分配的方法只有一种
	    if(dividerNum == divider[0]){
	      return 1;
	    }
	    //如果比较多个钱币的分配的时候，先用最大的钱币来分，例如，先用25来分，例如17，分25为0个，余数为17。
	    //然后把余数 17，用10来分，根据num/dividerNum得到为两种情况，一种是0个10，一种是1个10，再把余数17，和7 分别用5来分，以此类推
	    //最后分的结果全部加起来就是完整的分发的个数
	    for(int i = divider.length - 1; i >= 1; i--){
	      if(dividerNum == divider[i]){
	        for(int j = 0; j <= num / dividerNum ; j++){
	          result += divider((num - dividerNum*j), divider[i-1]);
	        }
	      }
	    }
	    return result;
	  }
	}