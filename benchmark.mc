# loads examples

load benchmark_examples/leader_election2.mc
load benchmark_examples/auth2.mc
load benchmark_examples/leader_election.mc
load benchmark_examples/controller.mc
load benchmark_examples/no_pro_1.mc
load benchmark_examples/deterministic.mc
load benchmark_examples/no_pro_2.mc
load benchmark_examples/group_present.mc
load benchmark_examples/ring_1.mc
load benchmark_examples/hypersurface.mc
load benchmark_examples/ring_2.mc
load benchmark_examples/independent.mc
load benchmark_examples/ring_3.mc


# projects examples

store project auth2
store project group_present
store project controller
store project independent
store project deterministic
store project leader_election
store project leader_election2
store project hypersurface
store project ring_1
store project ring_2
store project ring_3


graph auth2 lts/auth2
graph group_present lts/group_present
graph controller lts/controller
graph independent lts/independent
graph deterministic lts/deterministic
graph leader_election lts/leader_election
graph leader_election2 lts/leader_election2
graph no_pro_1 lts/no_pro_1
graph no_pro_2 lts/no_pro_2
graph hypersurface lts/hypersurface
graph ring_1 lts/ring_1
graph ring_2 lts/ring_2
graph ring_3 lts/ring_3

graph projection_auth2 lts/projection_auth2
graph projection_group_present lts/projection_group_present
graph projection_controller lts/projection_controller
graph projection_independent lts/projection_independent
graph projection_deterministic lts/projection_deterministic
graph projection_leader_election lts/projection_leader_election
graph projection_leader_election2 lts/projection_leader_election2
graph projection_hypersurface lts/projection_hypersurface
graph projection_ring_1 lts/projection_ring_1
graph projection_ring_2 lts/projection_ring_2
graph projection_ring_3 lts/projection_ring_3


extract projection_auth2 lts/auth2.ctx
extract projection_group_present lts/group_present.ctx
extract projection_controller lts/controller.ctx
extract projection_independent lts/independent.ctx
extract projection_deterministic lts/deterministic.ctx
extract projection_leader_election lts/leader_election.ctx
extract projection_leader_election2 lts/leader_election2.ctx
extract projection_hypersurface lts/hypersurface.ctx
extract projection_ring_1 lts/ring_1.ctx
extract projection_ring_2 lts/ring_2.ctx
extract projection_ring_3 lts/ring_3.ctx




