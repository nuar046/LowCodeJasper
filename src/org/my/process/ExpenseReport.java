


	
	public class ExpenseReport extends SvrProcess {

		HSSFWorkbook workbook = new HSSFWorkbook();   
		ProcessInfoParameter[] para = getParameter();
			for (ProcessInfoParameter p:para) {
				String name = p.getParameterName();
				if (p.getParameter() == null)
				else if(name.equals("DateFrom")) 
					DateFrom = p.getParameterAsTimestamp();
			 
				else if(name.equals("DateTo"))
			}
		}
			return norecs+" Records. Time Elapsed: "+timeElapsed;
		}
}