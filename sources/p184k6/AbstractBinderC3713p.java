package p184k6;

/* renamed from: k6.p */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3713p extends p184k6.AbstractBinderC3711n {

    /* renamed from: d */
    public static final java.lang.ref.WeakReference<byte[]> f16428d = null;

    /* renamed from: c */
    public java.lang.ref.WeakReference<byte[]> f16429c;

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            p184k6.AbstractBinderC3713p.f16428d = r0
            return
    }

    public AbstractBinderC3713p(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.ref.WeakReference<byte[]> r1 = p184k6.AbstractBinderC3713p.f16428d
            r0.f16429c = r1
            return
    }

    /* renamed from: k2 */
    public abstract byte[] mo8179k2();

    @Override // p184k6.AbstractBinderC3711n
    /* renamed from: x */
    public final byte[] mo8178x() {
            r2 = this;
            monitor-enter(r2)
            java.lang.ref.WeakReference<byte[]> r0 = r2.f16429c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            byte[] r0 = r2.mo8179k2()     // Catch: java.lang.Throwable -> L18
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L18
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18
            r2.f16429c = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}
