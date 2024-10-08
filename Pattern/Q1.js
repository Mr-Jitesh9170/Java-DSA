// Printing star =>
const printStart = (a) => {
      for (let i = 0; i < a; i++) {
            for (let j = 0; j < i; j++) {
                  if (j == i - 1) {
                        process.stdout.write("#");
                        if (i == a - 1) {
                              for (let k = 0; k < a; k++) {
                                    process.stdout.write(" # ");
                              }
                        }
                        console.log('\n');
                  } else {
                        process.stdout.write("    ");
                  }
            }
      }

      for (let i = a - 2; i >= 0; i--) {
            for (let j = 0; j < i; j++) {
                  if (j == i - 1) {
                        process.stdout.write("#");
                        console.log('\n');
                  } else {
                        process.stdout.write("    ");
                  }
            }
      }
}
printStart(8)



// ( Another pattern) =>
let a = 8;
for (let m = 0; m < a; m++) {
      for (let n = 0; n < m; n++) {
            if (n == m - 1) {
                  process.stdout.write("#");
                  console.log('\n');
                  if (m == a - 1) {
                        for (let k = 0; k < a + 2; k++) {
                              process.stdout.write(" # ");
                        }
                  }

            } else {
                  process.stdout.write("    ");
            }
      }

}

for (let s = a; s > 0; s--) {
      for (let t = 0; t < s; t++) {
            if (t == s - 1) {
                  process.stdout.write("#");
                  console.log('\n');
            } else {
                  process.stdout.write("    ");
            }
      }
}