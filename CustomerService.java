public class CustomerService {	
	@Autowired	
	private CustomerRepository customerRepository;	
	
	// Lỗi: Hàm này không có Annotation Transactional   
	public Customer getCustomerWithOrders(Long id) {   
			Customer customer = customerRepository.findById(id).orElseThrow();	
		// orders được cấu hình @OneToMany(fetch = FetchType.LAZY)	
			System.out.println(customer.getOrders().size()); // Gây lỗi tại đây	
		return customer;	
	}	
}	