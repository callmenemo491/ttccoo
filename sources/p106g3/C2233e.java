package p106g3;

/* renamed from: g3.e */
/* loaded from: classes.dex */
public final class C2233e {

    /* renamed from: a */
    public static final java.util.concurrent.Executor f10200a = null;

    /* renamed from: b */
    public static final java.util.concurrent.Executor f10201b = null;

    /* renamed from: g3.e$a */
    public class a implements java.util.concurrent.Executor {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = p106g3.C2238j.m5846f()
                r0.post(r2)
                return
        }
    }

    /* renamed from: g3.e$b */
    public class b implements java.util.concurrent.Executor {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r1) {
                r0 = this;
                r1.run()
                return
        }
    }

    static {
            g3.e$a r0 = new g3.e$a
            r0.<init>()
            p106g3.C2233e.f10200a = r0
            g3.e$b r0 = new g3.e$b
            r0.<init>()
            p106g3.C2233e.f10201b = r0
            return
    }
}
