package p010a9;

/* renamed from: a9.k */
/* loaded from: classes.dex */
public final class C0043k {

    /* renamed from: a */
    public final p010a9.AbstractC0034b f90a;

    /* renamed from: b */
    public final p010a9.C0043k.b f91b;

    /* renamed from: c */
    public final int f92c;

    /* renamed from: a9.k$a */
    public static abstract class a extends p010a9.AbstractC0033a<java.lang.String> {

        /* renamed from: a0 */
        public final java.lang.CharSequence f93a0;

        /* renamed from: b0 */
        public final p010a9.AbstractC0034b f94b0;

        /* renamed from: c0 */
        public final boolean f95c0;

        /* renamed from: d0 */
        public int f96d0;

        /* renamed from: e0 */
        public int f97e0;

        public a(p010a9.C0043k r3, java.lang.CharSequence r4) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f96d0 = r0
                a9.b r1 = r3.f90a
                r2.f94b0 = r1
                r2.f95c0 = r0
                int r3 = r3.f92c
                r2.f97e0 = r3
                r2.f93a0 = r4
                return
        }

        /* renamed from: a */
        public abstract int mo41a(int r1);

        /* renamed from: b */
        public abstract int mo42b(int r1);
    }

    /* renamed from: a9.k$b */
    public interface b {
        /* renamed from: a */
        java.util.Iterator<java.lang.String> mo43a(p010a9.C0043k r1, java.lang.CharSequence r2);
    }

    public C0043k(p010a9.C0043k.b r2) {
            r1 = this;
            a9.b$d r0 = p010a9.AbstractC0034b.d.f79Z
            r1.<init>()
            r1.f91b = r2
            r1.f90a = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.f92c = r2
            return
    }

    /* renamed from: a */
    public java.util.List<java.lang.String> m44a(java.lang.CharSequence r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            a9.k$b r0 = r2.f91b
            java.util.Iterator r3 = r0.mo43a(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            r0.add(r1)
            goto Le
        L1c:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }
}
