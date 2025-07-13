package sb;

/* renamed from: sb.n */
/* loaded from: classes.dex */
public abstract class AbstractC6020n extends java.lang.Exception {

    /* renamed from: Y */
    public static final boolean f23204Y = false;

    /* renamed from: Z */
    public static final java.lang.StackTraceElement[] f23205Z = null;

    static {
            java.lang.String r0 = "surefire.test.class.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            sb.AbstractC6020n.f23204Y = r0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            sb.AbstractC6020n.f23205Z = r0
            return
    }

    public AbstractC6020n() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractC6020n(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable fillInStackTrace() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }
}
