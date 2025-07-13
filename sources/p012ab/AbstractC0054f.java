package p012ab;

@com.google.auto.value.AutoValue
/* renamed from: ab.f */
/* loaded from: classes.dex */
public abstract class AbstractC0054f {

    @com.google.auto.value.AutoValue.Builder
    /* renamed from: ab.f$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract p012ab.AbstractC0054f mo64a();

        /* renamed from: b */
        public abstract p012ab.AbstractC0054f.a mo65b(long r1);
    }

    /* renamed from: ab.f$b */
    public enum b extends java.lang.Enum<p012ab.AbstractC0054f.b> {

        /* renamed from: Y */
        public static final p012ab.AbstractC0054f.b f127Y = null;

        /* renamed from: Z */
        public static final p012ab.AbstractC0054f.b f128Z = null;

        /* renamed from: a0 */
        public static final p012ab.AbstractC0054f.b f129a0 = null;

        /* renamed from: b0 */
        public static final /* synthetic */ p012ab.AbstractC0054f.b[] f130b0 = null;

        static {
                ab.f$b r0 = new ab.f$b
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                p012ab.AbstractC0054f.b.f127Y = r0
                ab.f$b r1 = new ab.f$b
                java.lang.String r3 = "BAD_CONFIG"
                r4 = 1
                r1.<init>(r3, r4)
                p012ab.AbstractC0054f.b.f128Z = r1
                ab.f$b r3 = new ab.f$b
                java.lang.String r5 = "AUTH_ERROR"
                r6 = 2
                r3.<init>(r5, r6)
                p012ab.AbstractC0054f.b.f129a0 = r3
                r5 = 3
                ab.f$b[] r5 = new p012ab.AbstractC0054f.b[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                p012ab.AbstractC0054f.b.f130b0 = r5
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p012ab.AbstractC0054f.b valueOf(java.lang.String r1) {
                java.lang.Class<ab.f$b> r0 = p012ab.AbstractC0054f.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ab.f$b r1 = (p012ab.AbstractC0054f.b) r1
                return r1
        }

        public static p012ab.AbstractC0054f.b[] values() {
                ab.f$b[] r0 = p012ab.AbstractC0054f.b.f130b0
                java.lang.Object r0 = r0.clone()
                ab.f$b[] r0 = (p012ab.AbstractC0054f.b[]) r0
                return r0
        }
    }

    public AbstractC0054f() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p012ab.AbstractC0054f.a m77a() {
            ab.b$b r0 = new ab.b$b
            r0.<init>()
            r1 = 0
            r0.mo65b(r1)
            return r0
    }

    /* renamed from: b */
    public abstract p012ab.AbstractC0054f.b mo61b();

    /* renamed from: c */
    public abstract java.lang.String mo62c();

    /* renamed from: d */
    public abstract long mo63d();
}
