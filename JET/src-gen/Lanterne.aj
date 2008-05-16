
privileged aspect TestAspect {
	
		
		
		
		private vessie.Vessie lanterne.impl.LanterneImpl.v;
		
		pointcut getter0() : call(int lanterne.impl.LanterneImpl.getIntensite());
		
		
		int around () : getter0(){
			
			return this.v.getContenance()*2*3.14;
		}
		
		
		
		
		
		private vessie.Vessie lanterne.impl.LanterneImpl.v2;
		
		pointcut getter1() : call(java.lang.String lanterne.impl.LanterneImpl.getLuminosite());
		
		
		java.lang.String around () : getter1(){
			
			return this.v2.getContenance()-1;
		}
		
		
}


