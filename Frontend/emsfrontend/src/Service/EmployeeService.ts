import axios from "axios";

const REST_API_BASE_URL = 'http://localhost:8080/api/employees';

export const getAllEmployees = () => axios.get(REST_API_BASE_URL);

export const createEmployee = (employee:any) => axios.post(REST_API_BASE_URL, employee);

export const getEmployeeById = (employeeId:number) => axios.get(REST_API_BASE_URL + '/' + employeeId);

export const updateEmployee = (employeeId:number, employee:any) => axios.put(REST_API_BASE_URL + '/' + employeeId, employee);

export const deleteEmployeeById = (employeeId:number) => axios.delete(REST_API_BASE_URL + '/' + employeeId);