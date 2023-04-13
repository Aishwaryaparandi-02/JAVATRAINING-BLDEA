package com.bldea.crorepathiApp.package1;
import java.util.Scanner;
public class Questions {
 static String result;
 static String result2;
 static int aud_phn=1;
 static int count_life_line=3;
 static int cnt_50_50=1;
 static int skip_cnt=1;
static Scanner sc=new Scanner(System.in);
public static boolean fetchQuestion1(String name) throws Exception {
	System.out.println("1. Who is the founder of Java?");
	System.out.println("a) Dennis Ritchie\n" 
	        + "b) Charles Babbage\n" 
			+ "c) Rahul Gandhi\n"
	        + "d) James Gosling\n"
			+ "e) life line");
	result = sc.next();
	if (result.equalsIgnoreCase("d")) {
		Candidate.setAmount(1000);
		return true;
	} 
	else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(1000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(1000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Dennis Ritchie\n" +
									                   "b) Charles Babbage\n" +
											           "c) Rahul Gandhi\n" + 
									                   "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Dennis Ritchie\n" +
									"b) Charles Babbage\n" +
											"c) Rahul Gandhi\n" +
									"d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(1000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(1000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Dennis Ritchie\n" +
									                   "b) Charles Babbage\n" +
									                   "c) Rahul Gandhi\n" + 
									                   "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Dennis Ritchie\n" +
									                   "b) Charles Babbage\n" +
											           "c) Rahul Gandhi\n" + 
									                   "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(1000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Dennis Ritchie\n" +
									                   "b) Charles Babbage\n" + 
											           "c) Rahul Gandhi\n" + 
									                   "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Dennis Ritchie\n" +
									                   "b) Charles Babbage\n" + 
											           "c) Rahul Gandhi\n" + 
									                   "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Dennis Ritchie\n" +
			                   "b) Charles Babbage\n" +
					           "c) Rahul Gandhi\n" + 
			                   "d) James Gosling\n");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(1000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestion2(String name) throws Exception{
	System.out.println("2. Who is the captain of RCB?");
	System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n"
			+ "e) help line");
	result = sc.next();
	if (result.equalsIgnoreCase("c")) {
		Candidate.setAmount(2000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(2000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(2000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("2")) {
										Candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(2000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("b) Maxwell\n" + "c) Fab duplesis\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(2000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 78%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(2000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(10000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(2000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(2000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(2000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(2000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestion3(String name)throws Exception 
{
System.out.println("3.What is the size of float and double in java?");
System.out.println("a) 32 and 64\n"
		+ "b) 32 and 32\n"
		+ "c) 64 and 64\n"
		+ "d) 64 and 32\n"
		+"e) life line");
    result = sc.next();
    if(result.equalsIgnoreCase("a")) {
    	Candidate.setAmount(10000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(10000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) 32 and 64\n"+ "d) 64 and 32\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(10000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(10000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) 32 and 64\n"+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) 32 and 64\n"+ "d) 64 and 32\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(10000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(10000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(10000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(10000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) 32 and 64\n"+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) 32 and 64\n"+ "d) 64 and 32\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 32 and 64\n"
											+ "b) 32 and 32\n"
											+ "c) 64 and 64\n"
											+ "d) 64 and 32\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) 32 and 64\n"
					+ "b) 32 and 32\n"
					+ "c) 64 and 64\n"
					+ "d) 64 and 32\n");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				Candidate.setAmount(10000);
				return true;
			}
		}

	}


	return false;
}

public static boolean fetchQuestion4(String name)throws Exception
{
System.out.println("4.Automatic type conversion is possible in which of the possible cases?");
System.out.println("a) Byte to int\n"
		+ "b) int to long\n"
		+ "c) long to int\n"
		+ "d) short to int\n"
		+ "e) life line");
    result = sc.next();
    if(result.equalsIgnoreCase("b")) {
    	Candidate.setAmount(20000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 30%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(20000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) int to long\n"+ "c) long to int\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(20000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Byte to int\n"
											+ "b) int to long\n"
											+ "c) long to int\n"
											+ "d) short to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(20000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) int to long\n"+ "c) long to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Byte to int\n"
											+ "b) int to long\n"
											+ "c) long to int\n"
											+ "d) short to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println( "b) int to long\n"+ "c) long to int\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(20000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 30%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(20000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Byte to int\n"
											+ "b) int to long\n"
											+ "c) long to int\n"
											+ "d) short to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(20000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 30%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Byte to int\n"
											+ "b) int to long\n"
											+ "c) long to int\n"
											+ "d) short to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(20000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 30%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) int to long\n"+ "c) long to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Byte to int\n"
											+ "b) int to long\n"
											+ "c) long to int\n"
											+ "d) short to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) int to long\n"+ "c) long to int\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 30%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) Byte to int\n"
											+ "b) int to long\n"
											+ "c) long to int\n"
											+ "d) short to int\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) Byte to int\n"
					+ "b) int to long\n"
					+ "c) long to int\n"
					+ "d) short to int\n");
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				Candidate.setAmount(20000);
				return true;
			}
		}

	}


	return false;
}
public static boolean fetchQuestion5(String name)throws Exception
{
System.out.println("5.When an array is passed to a method,What does the method receive?");
System.out.println("a) The reference of the array\n"
		+ "b) A copy of the array\n"
		+ "c) Length of the array\n"
		+ "d) Copy of first element\n"
		+"e) life line");
    result = sc.next();
    if(result.equalsIgnoreCase("a")) {
    	Candidate.setAmount(40000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 8%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(40000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) The reference of the array\n"+ "d) Copy of first element\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(40000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) The reference of the array\n"
											+ "b) A copy of the array\n"
											+ "c) Length of the array\n"
											+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(40000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) The reference of the array\n"+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) The reference of the array\n"
											+ "b) A copy of the array\n"
											+ "c) Length of the array\n"
											+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) The reference of the array\n"+ "d) Copy of first element\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(40000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 8%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(40000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) The reference of the array\n"
											+ "b) A copy of the array\n"
											+ "c) Length of the array\n"
											+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(40000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 8%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) The reference of the array\n"
											+ "b) A copy of the array\n"
											+ "c) Length of the array\n"
											+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(40000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 8%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) The reference of the array\n"+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) The reference of the array\n"
											+ "b) A copy of the array\n"
											+ "c) Length of the array\n"
											+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) The reference of the array\n"+ "d) Copy of first element\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 8%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) The reference of the array\n"
											+ "b) A copy of the array\n"
											+ "c) Length of the array\n"
											+ "d) Copy of first element\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(40000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) The reference of the array\n"
					+ "b) A copy of the array\n"
					+ "c) Length of the array\n"
					+ "d) Copy of first element\n");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				Candidate.setAmount(40000);
				return true;
			}
		}

	}


	return false;
}
public static boolean fetchQuestion6(String name)throws Exception
{
System.out.println("6.compareTo() returns?");
System.out.println("a) True\n"
		+ "b) False \n"
		+ "c) An int value\n"
		+ "d) None\n"
		+"e) lifeline");
    result = sc.next();
    if(result.equalsIgnoreCase("d")) {
    	Candidate.setAmount(600000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(600000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) False \n"+ "d) None\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(600000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(600000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) True\n"
											+ "b) False \n"
											+ "c) An int value\n"
											+ "d) None\n");;
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) False \n"+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) True\n"
											+ "b) False \n"
											+ "c) An int value\n"
											+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println( "b) False \n"+ "d) None\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(600000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(600000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(600000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) True\n"
											+ "b) False \n"
											+ "c) An int value\n"
											+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(600000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) True\n"
											+ "b) False \n"
											+ "c) An int value\n"
											+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(600000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(600000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) False \n"+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) True\n"
											+ "b) False \n"
											+ "c) An int value\n"
											+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) False \n"+ "d) None\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(600000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) True\n"
											+ "b) False \n"
											+ "c) An int value\n"
											+ "d) None\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(600000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) True\n"
					+ "b) False \n"
					+ "c) An int value\n"
					+ "d) None\n");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(600000);
				return true;
			}
		}

	}


	return false;
}
public static boolean fetchQuestion7(String name)throws Exception
{
System.out.println("7.To which of the following does the class string belong to?");
System.out.println("a) java.lang \n"
		+ "b) java.awt \n"
		+ "c) java.applet\n"
		+ "d) java.string\n"
		+  "e) life line");
    result = sc.next();
    if(result.equalsIgnoreCase("a")) {
    	Candidate.setAmount(700000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(700000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) java.lang \n"+ "c) java.applet\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(700000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(700000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) java.lang \n"
											+ "b) java.awt \n"
											+ "c) java.applet\n"
											+ "d) java.string\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(700000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) java.lang \n"+ "c) java.applet\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) java.lang \n"
											+ "b) java.awt \n"
											+ "c) java.applet\n"
											+ "d) java.string\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) java.lang \n"+ "c) java.applet\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(700000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(700000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(700000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) java.lang \n"
											+ "b) java.awt \n"
											+ "c) java.applet\n"
											+ "d) java.string\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(700000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) java.lang \n"
											+ "b) java.awt \n"
											+ "c) java.applet\n"
											+ "d) java.string\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(700000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(700000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) java.lang \n"+ "c) java.applet\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) java.lang \n"
											+ "b) java.awt \n"
											+ "c) java.applet\n"
											+ "d) java.string\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) java.lang \n"+ "c) java.applet\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(700000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 80%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) java.lang \n"
											+ "b) java.awt \n"
											+ "c) java.applet\n"
											+ "d) java.string\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(700000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) java.lang \n"
					+ "b) java.awt \n"
					+ "c) java.applet\n"
					+ "d) java.string\n");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				Candidate.setAmount(700000);
				return true;
			}
		}

	}


	return false;
}
public static boolean fetchQuestion8(String name)throws Exception
{
System.out.println("8.Total constructor string class have?");
System.out.println("a) 3\n"
		+ "b) 7\n"
		+ "c) 13\n"
		+ "d) 20\n"
		+ "e) lifeline");
    result = sc.next();
    if(result.equalsIgnoreCase("c")) {
    	Candidate.setAmount(800000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 8%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(800000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) 3\n"	+ "c) 13\n");
								result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(800000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(800000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 3\n"
											+ "b) 7\n"
											+ "c) 13\n"
											+ "d) 20\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(800000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) 3\n"	+ "c) 13\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 3\n"
											+ "b) 7\n"
											+ "c) 13\n"
											+ "d) 20\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) 3\n"	+ "c) 13\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(800000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 8%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(800000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(800000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 3\n"
											+ "b) 7\n"
											+ "c) 13\n"
											+ "d) 20\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(800000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 8%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 3\n"
											+ "b) 7\n"
											+ "c) 13\n"
											+ "d) 20\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(800000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 8%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(800000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) 3\n"	+ "c) 13\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 3\n"
											+ "b) 7\n"
											+ "c) 13\n"
											+ "d) 20\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) 3\n"	+ "c) 13\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(800000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 8%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) 3\n"
											+ "b) 7\n"
											+ "c) 13\n"
											+ "d) 20\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(800000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) 3\n"
					+ "b) 7\n"
					+ "c) 13\n"
					+ "d) 20\n");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				Candidate.setAmount(800000);
				return true;
			}
		}

	}


	return false;
}
public static boolean fetchQuestion9(String name)throws Exception
{
System.out.println("9.Identify the return type of a method that does not return any value?");
System.out.println("a) int\n"
		+ "b) void\n"
		+ "c) double\n"
		+ "d) none\n"
		+ "e) lifeline");
    result = sc.next();
    if(result.equalsIgnoreCase("b")) {
    	Candidate.setAmount(900000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(900000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) int\n"+ "b) void\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(900000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(900000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) int\n"
											+ "b) void\n"
											+ "c) double\n"
											+ "d) none\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(900000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) int\n"+ "b) void\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) int\n"
											+ "b) void\n"
											+ "c) double\n"
											+ "d) none\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) int\n"+ "b) void\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(900000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(900000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(900000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) int\n"
											+ "b) void\n"
											+ "c) double\n"
											+ "d) none\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(900000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) int\n"
											+ "b) void\n"
											+ "c) double\n"
											+ "d) none\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(900000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(900000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) int\n"+ "b) void\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) int\n"
											+ "b) void\n"
											+ "c) double\n"
											+ "d) none\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) int\n"+ "b) void\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(900000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) int\n"
											+ "b) void\n"
											+ "c) double\n"
											+ "d) none\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(900000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) int\n"
					+ "b) void\n"
					+ "c) double\n"
					+ "d) none\n");
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				Candidate.setAmount(900000);
				return true;
			}
		}

	}


	return false;
}
public static boolean fetchQuestion10(String name)throws Exception
{
System.out.println("10.Identify the modifier which cannot be used for constructor?");
System.out.println("a) public\n"
		+ "b) protected\n"
		+ "c) private\n"
		+ "d) static\n"
		+ "e) life line");
    result = sc.next();
    if(result.equalsIgnoreCase("d")) {
    	Candidate.setAmount(1000000);
    	return true;
    }
    else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(10000000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c) private\n"+ "d) static\n");
									result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(10000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) public\n"
											+ "b) protected\n"
											+ "c) private\n"
											+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(10000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) private\n"+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) public\n"
											+ "b) protected\n"
											+ "c) private\n"
											+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("c) private\n"+ "d) static\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(10000000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									Candidate.setAmount(10000000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) public\n"
											+ "b) protected\n"
											+ "c) private\n"
											+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result3.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(10000000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) public\n"
											+ "b) protected\n"
											+ "c) private\n"
											+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					Candidate.setAmount(10000000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) private\n"+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) public\n"
											+ "b) protected\n"
											+ "c) private\n"
											+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} 
					else if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c) private\n"+ "d) static\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(10000000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result4.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) public\n"
											+ "b) protected\n"
											+ "c) private\n"
											+ "d) static\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) public\n"
					+ "b) protected\n"
					+ "c) private\n"
					+ "d) static\n");
			result = sc.next();
			if (result.equalsIgnoreCase("d")) {
				Candidate.setAmount(10000000);
				return true;
			}
		}

	}


	return false;
}
}