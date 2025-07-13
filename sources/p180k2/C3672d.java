package p180k2;

/* renamed from: k2.d */
/* loaded from: classes.dex */
public final class C3672d<T> {

    /* renamed from: e */
    public static final p180k2.C3672d.b<java.lang.Object> f16245e = null;

    /* renamed from: a */
    public final T f16246a;

    /* renamed from: b */
    public final p180k2.C3672d.b<T> f16247b;

    /* renamed from: c */
    public final java.lang.String f16248c;

    /* renamed from: d */
    public volatile byte[] f16249d;

    /* renamed from: k2.d$a */
    public class a implements p180k2.C3672d.b<java.lang.Object> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p180k2.C3672d.b
        /* renamed from: a */
        public void mo8129a(byte[] r1, java.lang.Object r2, java.security.MessageDigest r3) {
                r0 = this;
                return
        }
    }

    /* renamed from: k2.d$b */
    public interface b<T> {
        /* renamed from: a */
        void mo8129a(byte[] r1, T r2, java.security.MessageDigest r3);
    }

    static {
            k2.d$a r0 = new k2.d$a
            r0.<init>()
            p180k2.C3672d.f16245e = r0
            return
    }

    public C3672d(java.lang.String r2, T r3, p180k2.C3672d.b<T> r4) {
            r1 = this;
            r1.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            r1.f16248c = r2
            r1.f16246a = r3
            java.lang.String r2 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r2)
            r1.f16247b = r4
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Must not be null or empty"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: a */
    public static <T> p180k2.C3672d<T> m8128a(java.lang.String r2, T r3) {
            k2.d r0 = new k2.d
            k2.d$b<java.lang.Object> r1 = p180k2.C3672d.f16245e
            r0.<init>(r2, r3, r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p180k2.C3672d
            if (r0 == 0) goto Lf
            k2.d r2 = (p180k2.C3672d) r2
            java.lang.String r0 = r1.f16248c
            java.lang.String r2 = r2.f16248c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f16248c
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Option{key='"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f16248c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
