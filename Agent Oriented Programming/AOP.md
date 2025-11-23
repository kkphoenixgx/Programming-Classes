# Agent Oriented Programming
2025-09-02

## Historical Context / Motivation

In the 1980s–1990s, object-oriented programming (OO) was already very useful for organizing complex systems. However, in some domains (such as distributed systems, social simulations, robotics, or e-commerce), OO felt limited:

- Objects don’t “make decisions”; they only respond to method calls.
- In distributed systems, we wanted **autonomous entities** that could perceive the environment and make decisions independently.

This led to the idea of **bringing AI concepts into programming**. Agent-oriented programming (AOP) emerged: software components are treated as agents, inspired by cognitive notions (beliefs, desires, intentions) or behavioral ones (perception-action).

![[Screenshot_20250911_005426_Google Play Books.jpg]]

## Agent 

An agent is a **software or hardware entity** that:

- perceives its environment.
- makes decisions autonomously,
- acts upon the environment to achieve goals.

An agent **acts on its own initiative**.

### BDI-style Definition:

An agent can be modeled using:

- **Beliefs:** what it knows (or believes) about the world.
- **Desires:** states of the world it would like to achieve.
- **Intentions:** concrete plans it has committed to in order to achieve its desires.