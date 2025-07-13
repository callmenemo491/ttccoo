package p214m2;

/* renamed from: m2.z */
/* loaded from: classes.dex */
public class C4348z {

    /* renamed from: a */
    public boolean f17834a;

    /* renamed from: b */
    public final android.os.Handler f17835b;

    /* renamed from: m2.z$a */
    public static final class a implements android.os.Handler.Callback {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Ld
                java.lang.Object r3 = r3.obj
                m2.w r3 = (p214m2.InterfaceC4345w) r3
                r3.mo9721d()
                return r1
            Ld:
                r3 = 0
                return r3
        }
    }

    public C4348z() {
            r3 = this;
            r3.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            m2.z$a r2 = new m2.z$a
            r2.<init>()
            r0.<init>(r1, r2)
            r3.f17835b = r0
            return
    }

    /* renamed from: a */
    public synchronized void m9733a(p214m2.InterfaceC4345w<?> r3, boolean r4) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17834a     // Catch: java.lang.Throwable -> L1d
            r1 = 1
            if (r0 != 0) goto L12
            if (r4 == 0) goto L9
            goto L12
        L9:
            r2.f17834a = r1     // Catch: java.lang.Throwable -> L1d
            r3.mo9721d()     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r2.f17834a = r3     // Catch: java.lang.Throwable -> L1d
            goto L1b
        L12:
            android.os.Handler r4 = r2.f17835b     // Catch: java.lang.Throwable -> L1d
            android.os.Message r3 = r4.obtainMessage(r1, r3)     // Catch: java.lang.Throwable -> L1d
            r3.sendToTarget()     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r2)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
