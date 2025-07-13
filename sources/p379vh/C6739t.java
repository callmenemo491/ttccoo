package p379vh;

/* renamed from: vh.t */
/* loaded from: classes.dex */
public class C6739t {

    /* renamed from: b */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f26036b = null;
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final java.lang.Throwable f26037a;

    static {
            java.lang.Class<vh.t> r0 = p379vh.C6739t.class
            java.lang.String r1 = "_handled"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p379vh.C6739t.f26036b = r0
            return
    }

    public C6739t(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f26037a = r1
            r0._handled = r2
            return
    }

    public C6739t(java.lang.Throwable r1, boolean r2, int r3) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>()
            r0.f26037a = r1
            r0._handled = r2
            return
    }

    /* renamed from: a */
    public final boolean m13666a() {
            r1 = this;
            int r0 = r1._handled
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.Throwable r1 = r2.f26037a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
