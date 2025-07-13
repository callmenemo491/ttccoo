package p179k1;

@p134hh.InterfaceC3044e(m7451c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m7452f = "CoroutinesRoom.kt", m7453l = {}, m7454m = "invokeSuspend")
/* renamed from: k1.k */
/* loaded from: classes.dex */
public final class C3653k extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public final /* synthetic */ java.util.concurrent.Callable<java.lang.Object> f16144c0;

    /* renamed from: d0 */
    public final /* synthetic */ p379vh.InterfaceC6703h<java.lang.Object> f16145d0;

    public C3653k(java.util.concurrent.Callable<java.lang.Object> r1, p379vh.InterfaceC6703h<java.lang.Object> r2, p101fh.InterfaceC2172d<? super p179k1.C3653k> r3) {
            r0 = this;
            r0.f16144c0 = r1
            r0.f16145d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
            r2 = this;
            k1.k r3 = new k1.k
            java.util.concurrent.Callable<java.lang.Object> r0 = r2.f16144c0
            vh.h<java.lang.Object> r1 = r2.f16145d0
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
            r2 = this;
            vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
            fh.d r4 = (p101fh.InterfaceC2172d) r4
            k1.k r3 = new k1.k
            java.util.concurrent.Callable<java.lang.Object> r0 = r2.f16144c0
            vh.h<java.lang.Object> r1 = r2.f16145d0
            r3.<init>(r0, r1, r4)
            ch.l r4 = ch.C0985l.f5061a
            r3.mo123o(r4)
            return r4
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r2) {
            r1 = this;
            p074e9.C1805a.m4540y(r2)
            java.util.concurrent.Callable<java.lang.Object> r2 = r1.f16144c0     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r2.call()     // Catch: java.lang.Throwable -> Lf
            vh.h<java.lang.Object> r0 = r1.f16145d0     // Catch: java.lang.Throwable -> Lf
            r0.mo5707k(r2)     // Catch: java.lang.Throwable -> Lf
            goto L19
        Lf:
            r2 = move-exception
            vh.h<java.lang.Object> r0 = r1.f16145d0
            java.lang.Object r2 = p074e9.C1805a.m4520e(r2)
            r0.mo5707k(r2)
        L19:
            ch.l r2 = ch.C0985l.f5061a
            return r2
    }
}
