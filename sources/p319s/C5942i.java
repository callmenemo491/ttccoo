package p319s;

/* renamed from: s.i */
/* loaded from: classes.dex */
public class C5942i<E> implements java.lang.Cloneable {

    /* renamed from: c0 */
    public static final java.lang.Object f22813c0 = null;

    /* renamed from: Y */
    public boolean f22814Y;

    /* renamed from: Z */
    public int[] f22815Z;

    /* renamed from: a0 */
    public java.lang.Object[] f22816a0;

    /* renamed from: b0 */
    public int f22817b0;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p319s.C5942i.f22813c0 = r0
            return
    }

    public C5942i() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f22814Y = r0
            r0 = 10
            int r0 = p319s.C5937d.m12318e(r0)
            int[] r1 = new int[r0]
            r2.f22815Z = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f22816a0 = r0
            return
    }

    /* renamed from: a */
    public void m12345a(int r7, E r8) {
            r6 = this;
            int r0 = r6.f22817b0
            if (r0 == 0) goto L10
            int[] r1 = r6.f22815Z
            int r2 = r0 + (-1)
            r1 = r1[r2]
            if (r7 > r1) goto L10
            r6.m12351g(r7, r8)
            return
        L10:
            boolean r1 = r6.f22814Y
            if (r1 == 0) goto L1c
            int[] r1 = r6.f22815Z
            int r1 = r1.length
            if (r0 < r1) goto L1c
            r6.m12347c()
        L1c:
            int r0 = r6.f22817b0
            int[] r1 = r6.f22815Z
            int r1 = r1.length
            if (r0 < r1) goto L3e
            int r1 = r0 + 1
            int r1 = p319s.C5937d.m12318e(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f22815Z
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f22816a0
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f22815Z = r2
            r6.f22816a0 = r1
        L3e:
            int[] r1 = r6.f22815Z
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f22816a0
            r7[r0] = r8
            int r0 = r0 + 1
            r6.f22817b0 = r0
            return
    }

    /* renamed from: b */
    public p319s.C5942i<E> m12346b() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            s.i r0 = (p319s.C5942i) r0     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = r2.f22815Z     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            int[] r1 = (int[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f22815Z = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = r2.f22816a0     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L1b
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            r0.f22816a0 = r1     // Catch: java.lang.CloneNotSupportedException -> L1b
            return r0
        L1b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: c */
    public final void m12347c() {
            r8 = this;
            int r0 = r8.f22817b0
            int[] r1 = r8.f22815Z
            java.lang.Object[] r2 = r8.f22816a0
            r3 = 0
            r4 = 0
            r5 = 0
        L9:
            if (r4 >= r0) goto L21
            r6 = r2[r4]
            java.lang.Object r7 = p319s.C5942i.f22813c0
            if (r6 == r7) goto L1e
            if (r4 == r5) goto L1c
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L1c:
            int r5 = r5 + 1
        L1e:
            int r4 = r4 + 1
            goto L9
        L21:
            r8.f22814Y = r3
            r8.f22817b0 = r5
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            s.i r0 = r1.m12346b()
            return r0
    }

    /* renamed from: d */
    public E m12348d(int r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m12349e(r2, r0)
            return r2
    }

    /* renamed from: e */
    public E m12349e(int r4, E r5) {
            r3 = this;
            int[] r0 = r3.f22815Z
            int r1 = r3.f22817b0
            int r4 = p319s.C5937d.m12314a(r0, r1, r4)
            if (r4 < 0) goto L16
            java.lang.Object[] r0 = r3.f22816a0
            r1 = r0[r4]
            java.lang.Object r2 = p319s.C5942i.f22813c0
            if (r1 != r2) goto L13
            goto L16
        L13:
            r4 = r0[r4]
            return r4
        L16:
            return r5
    }

    /* renamed from: f */
    public int m12350f(int r2) {
            r1 = this;
            boolean r0 = r1.f22814Y
            if (r0 == 0) goto L7
            r1.m12347c()
        L7:
            int[] r0 = r1.f22815Z
            r2 = r0[r2]
            return r2
    }

    /* renamed from: g */
    public void m12351g(int r7, E r8) {
            r6 = this;
            int[] r0 = r6.f22815Z
            int r1 = r6.f22817b0
            int r0 = p319s.C5937d.m12314a(r0, r1, r7)
            if (r0 < 0) goto Lf
            java.lang.Object[] r7 = r6.f22816a0
            r7[r0] = r8
            goto L7e
        Lf:
            int r0 = ~r0
            int r1 = r6.f22817b0
            if (r0 >= r1) goto L23
            java.lang.Object[] r2 = r6.f22816a0
            r3 = r2[r0]
            java.lang.Object r4 = p319s.C5942i.f22813c0
            if (r3 != r4) goto L23
            int[] r1 = r6.f22815Z
            r1[r0] = r7
            r2[r0] = r8
            return
        L23:
            boolean r2 = r6.f22814Y
            if (r2 == 0) goto L38
            int[] r2 = r6.f22815Z
            int r2 = r2.length
            if (r1 < r2) goto L38
            r6.m12347c()
            int[] r0 = r6.f22815Z
            int r1 = r6.f22817b0
            int r0 = p319s.C5937d.m12314a(r0, r1, r7)
            int r0 = ~r0
        L38:
            int r1 = r6.f22817b0
            int[] r2 = r6.f22815Z
            int r2 = r2.length
            if (r1 < r2) goto L5a
            int r1 = r1 + 1
            int r1 = p319s.C5937d.m12318e(r1)
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int[] r3 = r6.f22815Z
            int r4 = r3.length
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r2, r5, r4)
            java.lang.Object[] r3 = r6.f22816a0
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r5, r1, r5, r4)
            r6.f22815Z = r2
            r6.f22816a0 = r1
        L5a:
            int r1 = r6.f22817b0
            int r2 = r1 - r0
            if (r2 == 0) goto L70
            int[] r2 = r6.f22815Z
            int r3 = r0 + 1
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            java.lang.Object[] r1 = r6.f22816a0
            int r2 = r6.f22817b0
            int r2 = r2 - r0
            java.lang.System.arraycopy(r1, r0, r1, r3, r2)
        L70:
            int[] r1 = r6.f22815Z
            r1[r0] = r7
            java.lang.Object[] r7 = r6.f22816a0
            r7[r0] = r8
            int r7 = r6.f22817b0
            int r7 = r7 + 1
            r6.f22817b0 = r7
        L7e:
            return
    }

    /* renamed from: j */
    public int m12352j() {
            r1 = this;
            boolean r0 = r1.f22814Y
            if (r0 == 0) goto L7
            r1.m12347c()
        L7:
            int r0 = r1.f22817b0
            return r0
    }

    /* renamed from: k */
    public E m12353k(int r2) {
            r1 = this;
            boolean r0 = r1.f22814Y
            if (r0 == 0) goto L7
            r1.m12347c()
        L7:
            java.lang.Object[] r0 = r1.f22816a0
            r2 = r0[r2]
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.m12352j()
            if (r0 > 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.f22817b0
            int r1 = r1 * 28
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L18:
            int r2 = r3.f22817b0
            if (r1 >= r2) goto L41
            if (r1 <= 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            int r2 = r3.m12350f(r1)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            java.lang.Object r2 = r3.m12353k(r1)
            if (r2 == r3) goto L39
            r0.append(r2)
            goto L3e
        L39:
            java.lang.String r2 = "(this Map)"
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L18
        L41:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
