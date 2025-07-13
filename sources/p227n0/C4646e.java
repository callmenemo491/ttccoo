package p227n0;

/* renamed from: n0.e */
/* loaded from: classes.dex */
public final class C4646e {

    /* renamed from: a */
    public final p227n0.C4646e.a f18552a;

    /* renamed from: n0.e$a */
    public interface a {
    }

    /* renamed from: n0.e$b */
    public static class b implements p227n0.C4646e.a {

        /* renamed from: a */
        public final android.view.GestureDetector f18553a;

        public b(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
                r1 = this;
                r1.<init>()
                android.view.GestureDetector r0 = new android.view.GestureDetector
                r0.<init>(r2, r3, r4)
                r1.f18553a = r0
                return
        }
    }

    public C4646e(android.content.Context r3, android.view.GestureDetector.OnGestureListener r4) {
            r2 = this;
            r2.<init>()
            n0.e$b r0 = new n0.e$b
            r1 = 0
            r0.<init>(r3, r4, r1)
            r2.f18552a = r0
            return
    }
}
