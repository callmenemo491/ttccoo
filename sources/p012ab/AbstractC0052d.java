package p012ab;

@com.google.auto.value.AutoValue
/* renamed from: ab.d */
/* loaded from: classes.dex */
public abstract class AbstractC0052d {

    /* renamed from: ab.d$a */
    public enum a extends java.lang.Enum<p012ab.AbstractC0052d.a> {

        /* renamed from: Y */
        public static final p012ab.AbstractC0052d.a f119Y = null;

        /* renamed from: Z */
        public static final p012ab.AbstractC0052d.a f120Z = null;

        /* renamed from: a0 */
        public static final /* synthetic */ p012ab.AbstractC0052d.a[] f121a0 = null;

        static {
                ab.d$a r0 = new ab.d$a
                java.lang.String r1 = "OK"
                r2 = 0
                r0.<init>(r1, r2)
                p012ab.AbstractC0052d.a.f119Y = r0
                ab.d$a r1 = new ab.d$a
                java.lang.String r3 = "BAD_CONFIG"
                r4 = 1
                r1.<init>(r3, r4)
                p012ab.AbstractC0052d.a.f120Z = r1
                r3 = 2
                ab.d$a[] r3 = new p012ab.AbstractC0052d.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                p012ab.AbstractC0052d.a.f121a0 = r3
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p012ab.AbstractC0052d.a valueOf(java.lang.String r1) {
                java.lang.Class<ab.d$a> r0 = p012ab.AbstractC0052d.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ab.d$a r1 = (p012ab.AbstractC0052d.a) r1
                return r1
        }

        public static p012ab.AbstractC0052d.a[] values() {
                ab.d$a[] r0 = p012ab.AbstractC0052d.a.f121a0
                java.lang.Object r0 = r0.clone()
                ab.d$a[] r0 = (p012ab.AbstractC0052d.a[]) r0
                return r0
        }
    }

    public AbstractC0052d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract p012ab.AbstractC0054f mo56a();

    /* renamed from: b */
    public abstract java.lang.String mo57b();

    /* renamed from: c */
    public abstract java.lang.String mo58c();

    /* renamed from: d */
    public abstract p012ab.AbstractC0052d.a mo59d();

    /* renamed from: e */
    public abstract java.lang.String mo60e();
}
