package p336t4;

/* renamed from: t4.a */
/* loaded from: classes.dex */
public abstract class AbstractC6156a {

    /* renamed from: a */
    public final int f23746a;

    /* renamed from: t4.a$a */
    public static final class a extends p336t4.AbstractC6156a {

        /* renamed from: b */
        public final long f23747b;

        /* renamed from: c */
        public final java.util.List<p336t4.AbstractC6156a.b> f23748c;

        /* renamed from: d */
        public final java.util.List<p336t4.AbstractC6156a.a> f23749d;

        public a(int r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f23747b = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f23748c = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f23749d = r1
                return
        }

        /* renamed from: b */
        public p336t4.AbstractC6156a.a m12700b(int r5) {
                r4 = this;
                java.util.List<t4.a$a> r0 = r4.f23749d
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                java.util.List<t4.a$a> r2 = r4.f23749d
                java.lang.Object r2 = r2.get(r1)
                t4.a$a r2 = (p336t4.AbstractC6156a.a) r2
                int r3 = r2.f23746a
                if (r3 != r5) goto L16
                return r2
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                r5 = 0
                return r5
        }

        /* renamed from: c */
        public p336t4.AbstractC6156a.b m12701c(int r5) {
                r4 = this;
                java.util.List<t4.a$b> r0 = r4.f23748c
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                java.util.List<t4.a$b> r2 = r4.f23748c
                java.lang.Object r2 = r2.get(r1)
                t4.a$b r2 = (p336t4.AbstractC6156a.b) r2
                int r3 = r2.f23746a
                if (r3 != r5) goto L16
                return r2
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                r5 = 0
                return r5
        }

        @Override // p336t4.AbstractC6156a
        public java.lang.String toString() {
                r6 = this;
                int r0 = r6.f23746a
                java.lang.String r0 = p336t4.AbstractC6156a.m12699a(r0)
                java.util.List<t4.a$b> r1 = r6.f23748c
                java.lang.Object[] r1 = r1.toArray()
                java.lang.String r1 = java.util.Arrays.toString(r1)
                java.util.List<t4.a$a> r2 = r6.f23749d
                java.lang.Object[] r2 = r2.toArray()
                java.lang.String r2 = java.util.Arrays.toString(r2)
                r3 = 22
                int r3 = p064e.C1489c.m4038a(r0, r3)
                int r3 = p064e.C1489c.m4038a(r1, r3)
                int r3 = p064e.C1489c.m4038a(r2, r3)
                java.lang.String r4 = " leaves: "
                java.lang.String r5 = " containers: "
                java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r3, r0, r4, r1, r5)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: t4.a$b */
    public static final class b extends p336t4.AbstractC6156a {

        /* renamed from: b */
        public final p371v5.C6571u f23750b;

        public b(int r1, p371v5.C6571u r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f23750b = r2
                return
        }
    }

    public AbstractC6156a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f23746a = r1
            return
    }

    /* renamed from: a */
    public static java.lang.String m12699a(int r5) {
            int r0 = r5 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            int r1 = r5 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            int r2 = r5 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = (char) r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 4
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f23746a
            java.lang.String r0 = m12699a(r0)
            return r0
    }
}
