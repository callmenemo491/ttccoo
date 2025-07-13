package p048d2;

/* renamed from: d2.d */
/* loaded from: classes.dex */
public final class C1265d<IT> extends androidx.recyclerview.widget.C0604o.b {

    /* renamed from: a */
    public final java.util.List<IT> f6743a;

    /* renamed from: b */
    public final java.util.List<IT> f6744b;

    /* renamed from: c */
    public final mh.InterfaceC4624p<IT, IT, java.lang.Boolean> f6745c;

    /* renamed from: d */
    public final mh.InterfaceC4624p<IT, IT, java.lang.Boolean> f6746d;

    public C1265d(java.util.List<? extends IT> r2, java.util.List<? extends IT> r3, mh.InterfaceC4624p<? super IT, ? super IT, java.lang.Boolean> r4, mh.InterfaceC4624p<? super IT, ? super IT, java.lang.Boolean> r5) {
            r1 = this;
            java.lang.String r0 = "oldItems"
            p214m2.C4339q.m9707l(r2, r0)
            r1.<init>()
            r1.f6743a = r2
            r1.f6744b = r3
            r1.f6745c = r4
            r1.f6746d = r5
            return
    }

    @Override // androidx.recyclerview.widget.C0604o.b
    /* renamed from: a */
    public boolean mo2017a(int r2, int r3) {
            r1 = this;
            java.util.List<IT> r0 = r1.f6743a
            java.lang.Object r2 = r0.get(r2)
            java.util.List<IT> r0 = r1.f6744b
            java.lang.Object r3 = r0.get(r3)
            mh.p<IT, IT, java.lang.Boolean> r0 = r1.f6746d
            java.lang.Object r2 = r0.mo122l(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    @Override // androidx.recyclerview.widget.C0604o.b
    /* renamed from: b */
    public boolean mo2018b(int r2, int r3) {
            r1 = this;
            java.util.List<IT> r0 = r1.f6743a
            java.lang.Object r2 = r0.get(r2)
            java.util.List<IT> r0 = r1.f6744b
            java.lang.Object r3 = r0.get(r3)
            mh.p<IT, IT, java.lang.Boolean> r0 = r1.f6745c
            java.lang.Object r2 = r0.mo122l(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    @Override // androidx.recyclerview.widget.C0604o.b
    /* renamed from: d */
    public int mo2020d() {
            r1 = this;
            java.util.List<IT> r0 = r1.f6744b
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.C0604o.b
    /* renamed from: e */
    public int mo2021e() {
            r1 = this;
            java.util.List<IT> r0 = r1.f6743a
            int r0 = r0.size()
            return r0
    }
}
