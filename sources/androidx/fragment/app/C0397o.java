package androidx.fragment.app;

/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public class C0397o extends androidx.fragment.app.ComponentCallbacksC0395n.f {

    /* renamed from: a */
    public final /* synthetic */ p241o.InterfaceC4866a f2327a;

    /* renamed from: b */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f2328b;

    /* renamed from: c */
    public final /* synthetic */ p045d.AbstractC1255a f2329c;

    /* renamed from: d */
    public final /* synthetic */ androidx.activity.result.InterfaceC0194b f2330d;

    /* renamed from: e */
    public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f2331e;

    public C0397o(androidx.fragment.app.ComponentCallbacksC0395n r1, p241o.InterfaceC4866a r2, java.util.concurrent.atomic.AtomicReference r3, p045d.AbstractC1255a r4, androidx.activity.result.InterfaceC0194b r5) {
            r0 = this;
            r0.f2331e = r1
            r0.f2327a = r2
            r0.f2328b = r3
            r0.f2329c = r4
            r0.f2330d = r5
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n.f
    /* renamed from: a */
    public void mo1349a() {
            r6 = this;
            androidx.fragment.app.n r0 = r6.f2331e
            java.util.Objects.requireNonNull(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fragment_"
            r1.append(r2)
            java.lang.String r2 = r0.f2281c0
            r1.append(r2)
            java.lang.String r2 = "_rq#"
            r1.append(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f2275R0
            int r0 = r0.getAndIncrement()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            o.a r1 = r6.f2327a
            r2 = 0
            java.lang.Object r1 = r1.apply(r2)
            androidx.activity.result.ActivityResultRegistry r1 = (androidx.activity.result.ActivityResultRegistry) r1
            java.util.concurrent.atomic.AtomicReference r2 = r6.f2328b
            androidx.fragment.app.n r3 = r6.f2331e
            d.a r4 = r6.f2329c
            androidx.activity.result.b r5 = r6.f2330d
            androidx.activity.result.c r0 = r1.m442c(r0, r3, r4, r5)
            r2.set(r0)
            return
    }
}
