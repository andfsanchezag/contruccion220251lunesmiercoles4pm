package app.adapters.inputs;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import app.adapters.inputs.utils.Utils;
import app.ports.InputPort;

public class LoginInput implements InputPort {
	private Map<String, InputPort> inputs;
	@Autowired
	private AdminInput adminInput;
	@Autowired
	private GuestInput guestInput;
	@Autowired
	private PartnerInput partnerInput;
	private final String MENU = "Ingrese la opcion que desea:/n 1. iniciar sesion /n 2. salir";
	
	

	public LoginInput(AdminInput adminInput, GuestInput guestInput, PartnerInput partnerInput) {
		super();
		this.adminInput = adminInput;
		this.guestInput = guestInput;
		this.partnerInput = partnerInput;
		inputs.put("partner", partnerInput);
		inputs.put("guest", guestInput);
		inputs.put("admin", adminInput);

	}



	@Override
	public void menu() throws Exception {
		System.out.println(MENU);
		String option = Utils.getReader().nextLine();
		switch (option){
		case "1":{}
		}
	}

}
