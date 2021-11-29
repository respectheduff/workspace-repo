<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><input type="text" id="firstNameFilter" v-model="filter.firstName" /></td>
        <td><input type="text" id="lastNameFilter" v-model="filter.LastName"/></td>
        <td><input type="text" id="usernameFilter" v-model="filter.userName"/></td>
        <td><input type="text" id="emailFilter" v-model="filter.emailAddress"/></td>
        <td>
          <select id="statusFilter" v-model="filter.status">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      <tr v-for="user in users" v-bind:key="user.id" v-bind:class="{disabled : user.status === 'Disabled' }">
        <td>{{user.firstName}}</td>
        <td>{{user.lastname}}</td>
        <td>{{user.username}}</td>
        <td>{{user.emailAdress}}</td>
        <td>{{user.status}}</td>

        </tr>
    </tbody>
  </table>
</template>

<script>
export default {
  name: 'user-list',
  data() {
    return {
      filter:{firstName: '', lastName: '', userName: '', emailAddress: '', status: ''},
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Disabled' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Disabled' }
      ]
    }
  },
  computed: {
    filteredList() {
      let output = this.user;

  if(this.filter.firstName !== '') {
    output = output.users.filter((user) => {
     return user.firstName.toLowerCase().includes(this.filter.firstName.toLowerCase());
    });
    }
    if(this.filter.lastName !== '') {
    output = output.users.filter((user) => {
     return user.lastName.toLowerCase().includes(this.filter.lastName.toLowerCase());
    });
    }
    if(this.filter.userName !== '') {
    output = output.users.filter((user) => {
     return user.userName.toLowerCase().includes(this.filter.userName.toLowerCase());
    });
    }
    if(this.filter.emailAddress !== '') {
    output = output.users.filter((user) => {
     return user.emailAddress.toLowerCase().includes(this.filter.emailAddress.toLowerCase());
    });
    }
    if(this.filter.status !== '') {
    output = output.users.filter((user) => {
     return user.status.toLowerCase().includes(this.filter.status.toLowerCase());
    });
  
    }
    return output;
    }
  }
  
  }
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>