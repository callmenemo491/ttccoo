package p145i7;

/* renamed from: i7.e */
/* loaded from: classes.dex */
public final class C3096e implements p310ra.InterfaceC5802b<p145i7.C3096e> {

    /* renamed from: d */
    public static final qa.InterfaceC5608e<java.lang.Object> f12478d = null;

    /* renamed from: a */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5608e<?>> f12479a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5610g<?>> f12480b;

    /* renamed from: c */
    public final qa.InterfaceC5608e<java.lang.Object> f12481c;

    static {
            qa.e r0 = p145i7.C3095d.f12477a
            p145i7.C3096e.f12478d = r0
            return
    }

    public C3096e() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f12479a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f12480b = r0
            qa.e r0 = p145i7.C3095d.f12477a
            r1.f12481c = r0
            return
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ p310ra.InterfaceC5802b m7566a(java.lang.Class r2, qa.InterfaceC5608e r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, qa.e<?>> r0 = r1.f12479a
            r0.put(r2, r3)
            java.util.Map<java.lang.Class<?>, qa.g<?>> r3 = r1.f12480b
            r3.remove(r2)
            return r1
    }
}
