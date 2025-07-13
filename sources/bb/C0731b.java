package bb;

/* renamed from: bb.b */
/* loaded from: classes.dex */
public class C0731b {

    /* renamed from: a */
    public java.lang.String f4010a;

    public C0731b(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f4010a = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof bb.C0731b
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            bb.b r2 = (bb.C0731b) r2
            java.lang.String r0 = r1.f4010a
            java.lang.String r2 = r2.f4010a
            boolean r2 = p248o6.C4924o.m11074a(r0, r2)
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4010a
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "token"
            java.lang.String r3 = r5.f4010a
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r3 = 5
            int r3 = r3 + 1
            int r4 = r0.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "="
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 100
            r0.<init>(r2)
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r2 = r1.size()
            r3 = 0
        L50:
            if (r3 >= r2) goto L67
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r4 = r2 + (-1)
            if (r3 >= r4) goto L64
            java.lang.String r4 = ", "
            r0.append(r4)
        L64:
            int r3 = r3 + 1
            goto L50
        L67:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
