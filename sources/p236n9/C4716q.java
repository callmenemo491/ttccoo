package p236n9;

/* renamed from: n9.q */
/* loaded from: classes.dex */
public final class C4716q {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<java.security.SecureRandom> f18832a = null;

    /* renamed from: n9.q$a */
    public class a extends java.lang.ThreadLocal<java.security.SecureRandom> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public java.security.SecureRandom initialValue() {
                r1 = this;
                java.security.SecureRandom r0 = new java.security.SecureRandom
                r0.<init>()
                r0.nextLong()
                return r0
        }
    }

    static {
            n9.q$a r0 = new n9.q$a
            r0.<init>()
            p236n9.C4716q.f18832a = r0
            return
    }

    /* renamed from: a */
    public static byte[] m10773a(int r1) {
            byte[] r1 = new byte[r1]
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = p236n9.C4716q.f18832a
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            r0.nextBytes(r1)
            return r1
    }
}
