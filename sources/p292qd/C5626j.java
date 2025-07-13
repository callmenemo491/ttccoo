package p292qd;

@p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.media.UampNotificationManager$DescriptionAdapter$resolveUriAsBitmap$2", m7452f = "UampNotificationManager.kt", m7453l = {}, m7454m = "invokeSuspend")
/* renamed from: qd.j */
/* loaded from: classes.dex */
public final class C5626j extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super android.graphics.Bitmap>, java.lang.Object> {

    /* renamed from: c0 */
    public /* synthetic */ java.lang.Object f21903c0;

    /* renamed from: d0 */
    public final /* synthetic */ p292qd.C5625i f21904d0;

    /* renamed from: e0 */
    public final /* synthetic */ android.net.Uri f21905e0;

    public C5626j(p292qd.C5625i r1, android.net.Uri r2, p101fh.InterfaceC2172d<? super p292qd.C5626j> r3) {
            r0 = this;
            r0.f21904d0 = r1
            r0.f21905e0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
            r3 = this;
            qd.j r0 = new qd.j
            qd.i r1 = r3.f21904d0
            android.net.Uri r2 = r3.f21905e0
            r0.<init>(r1, r2, r5)
            r0.f21903c0 = r4
            return r0
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super android.graphics.Bitmap> r5) {
            r3 = this;
            vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
            fh.d r5 = (p101fh.InterfaceC2172d) r5
            qd.j r0 = new qd.j
            qd.i r1 = r3.f21904d0
            android.net.Uri r2 = r3.f21905e0
            r0.<init>(r1, r2, r5)
            r0.f21903c0 = r4
            ch.l r4 = ch.C0985l.f5061a
            java.lang.Object r4 = r0.mo123o(r4)
            return r4
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r3) {
            r2 = this;
            p074e9.C1805a.m4540y(r3)
            java.lang.Object r3 = r2.f21903c0
            vh.b0 r3 = (p379vh.InterfaceC6686b0) r3
            qd.i r3 = r2.f21904d0
            android.net.Uri r0 = r2.f21905e0
            android.content.Context r3 = r3.f21890a     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.j r3 = com.bumptech.glide.ComponentCallbacks2C0999c.m2736e(r3)     // Catch: java.lang.Throwable -> L2e
            c3.h r1 = p292qd.C5627k.f21906a     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.j r3 = r3.mo2763a(r1)     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.i r3 = r3.mo2765n()     // Catch: java.lang.Throwable -> L2e
            com.bumptech.glide.i r3 = r3.mo2756S(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = 144(0x90, float:2.02E-43)
            c3.c r3 = r3.m2761X(r0, r0)     // Catch: java.lang.Throwable -> L2e
            c3.f r3 = (p033c3.C0860f) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L2e
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L2e
            goto L33
        L2e:
            r3 = move-exception
            java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
        L33:
            boolean r0 = r3 instanceof ch.C0979f.a
            if (r0 == 0) goto L38
            r3 = 0
        L38:
            return r3
    }
}
