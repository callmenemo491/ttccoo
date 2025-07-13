package p072e7;

/* renamed from: e7.o4 */
/* loaded from: classes.dex */
public final class C1697o4 {

    /* renamed from: a */
    public final java.lang.Throwable f7713a;

    /* renamed from: e7.o4$a */
    public class a extends java.lang.Throwable {
        public a() {
                r1 = this;
                java.lang.String r0 = "Failure occurred while trying to finish a future."
                r1.<init>(r0)
                return
        }

        @Override // java.lang.Throwable
        public final synchronized java.lang.Throwable fillInStackTrace() {
                r0 = this;
                monitor-enter(r0)
                monitor-exit(r0)
                return r0
        }
    }

    static {
            e7.o4 r0 = new e7.o4
            e7.o4$a r1 = new e7.o4$a
            r1.<init>()
            r0.<init>(r1)
            return
    }

    public C1697o4(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f7713a = r1
            return
    }
}
