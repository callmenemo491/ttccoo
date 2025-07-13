package kotlinx.coroutines;

/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends p101fh.InterfaceC2175g.a {

    /* renamed from: O */
    public static final /* synthetic */ int f17182O = 0;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C4149a implements p101fh.InterfaceC2175g.b<kotlinx.coroutines.CoroutineExceptionHandler> {

        /* renamed from: Y */
        public static final /* synthetic */ kotlinx.coroutines.CoroutineExceptionHandler.C4149a f17183Y = null;

        static {
                kotlinx.coroutines.CoroutineExceptionHandler$a r0 = new kotlinx.coroutines.CoroutineExceptionHandler$a
                r0.<init>()
                kotlinx.coroutines.CoroutineExceptionHandler.C4149a.f17183Y = r0
                return
        }

        public C4149a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    void handleException(p101fh.InterfaceC2175g r1, java.lang.Throwable r2);
}
