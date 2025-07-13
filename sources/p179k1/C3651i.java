package p179k1;

@p134hh.InterfaceC3044e(m7451c = "androidx.room.CoroutinesRoom$Companion$execute$2", m7452f = "CoroutinesRoom.kt", m7453l = {}, m7454m = "invokeSuspend")
/* renamed from: k1.i */
/* loaded from: classes.dex */
public final class C3651i extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<java.lang.Object>, java.lang.Object> {

    /* renamed from: c0 */
    public final /* synthetic */ java.util.concurrent.Callable<java.lang.Object> f16141c0;

    public C3651i(java.util.concurrent.Callable<java.lang.Object> r1, p101fh.InterfaceC2172d<? super p179k1.C3651i> r2) {
            r0 = this;
            r0.f16141c0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            k1.i r2 = new k1.i
            java.util.concurrent.Callable<java.lang.Object> r0 = r1.f16141c0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<java.lang.Object> r3) {
            r1 = this;
            vh.b0 r2 = (p379vh.InterfaceC6686b0) r2
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            k1.i r2 = new k1.i
            java.util.concurrent.Callable<java.lang.Object> r0 = r1.f16141c0
            r2.<init>(r0, r3)
            ch.l r2 = ch.C0985l.f5061a
            p074e9.C1805a.m4540y(r2)
            java.lang.Object r2 = r0.call()
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r1) {
            r0 = this;
            p074e9.C1805a.m4540y(r1)
            java.util.concurrent.Callable<java.lang.Object> r1 = r0.f16141c0
            java.lang.Object r1 = r1.call()
            return r1
    }
}
