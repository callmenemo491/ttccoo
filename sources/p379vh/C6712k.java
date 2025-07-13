package p379vh;

/* renamed from: vh.k */
/* loaded from: classes.dex */
public final class C6712k extends p379vh.C6739t {

    /* renamed from: c */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f26005c = null;
    private volatile /* synthetic */ int _resumed;

    static {
            java.lang.Class<vh.k> r0 = p379vh.C6712k.class
            java.lang.String r1 = "_resumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p379vh.C6712k.f26005c = r0
            return
    }

    public C6712k(p101fh.InterfaceC2172d<?> r3, java.lang.Throwable r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
    }
}
