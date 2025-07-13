package androidx.fragment.app;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public class C0399p extends androidx.activity.result.AbstractC0195c<java.lang.Object> {

    /* renamed from: a */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f2333a;

    public C0399p(androidx.fragment.app.ComponentCallbacksC0395n r1, java.util.concurrent.atomic.AtomicReference r2, p045d.AbstractC1255a r3) {
            r0 = this;
            r0.f2333a = r2
            r0.<init>()
            return
    }

    @Override // androidx.activity.result.AbstractC0195c
    /* renamed from: a */
    public void mo446a(java.lang.Object r2, p030c0.C0816c r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f2333a
            java.lang.Object r0 = r0.get()
            androidx.activity.result.c r0 = (androidx.activity.result.AbstractC0195c) r0
            if (r0 == 0) goto Le
            r0.mo446a(r2, r3)
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Operation cannot be started before fragment is in created state"
            r2.<init>(r3)
            throw r2
    }

    @Override // androidx.activity.result.AbstractC0195c
    /* renamed from: b */
    public void mo447b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f2333a
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            androidx.activity.result.c r0 = (androidx.activity.result.AbstractC0195c) r0
            if (r0 == 0) goto Le
            r0.mo447b()
        Le:
            return
    }
}
