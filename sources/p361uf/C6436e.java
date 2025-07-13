package p361uf;

/* renamed from: uf.e */
/* loaded from: classes.dex */
public final class C6436e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p205ld.C4265b<android.graphics.drawable.Drawable>, p205ld.C4265b<android.graphics.drawable.Drawable>> {

    /* renamed from: Z */
    public final /* synthetic */ p171jd.C3515h f24983Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f24984a0;

    public C6436e(p171jd.C3515h r1, java.lang.String r2) {
            r0 = this;
            r0.f24983Z = r1
            r0.f24984a0 = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public p205ld.C4265b<android.graphics.drawable.Drawable> mo107b(p205ld.C4265b<android.graphics.drawable.Drawable> r3) {
            r2 = this;
            ld.b r3 = (p205ld.C4265b) r3
            java.lang.String r0 = "$this$setGlideRequest"
            p214m2.C4339q.m9706k(r3, r0)
            jd.h r0 = r2.f24983Z
            java.lang.Object r0 = r0.f15195c
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            android.content.Context r0 = r0.getContext()
            com.bumptech.glide.j r0 = com.bumptech.glide.ComponentCallbacks2C0999c.m2736e(r0)
            ld.c r0 = (p205ld.C4266c) r0
            java.lang.String r1 = r2.f24984a0
            if (r1 != 0) goto L1d
            java.lang.String r1 = ""
        L1d:
            com.bumptech.glide.i r0 = r0.mo2766o()
            com.bumptech.glide.i r0 = r0.mo2758U(r1)
            ld.b r0 = (p205ld.C4265b) r0
            r1 = 185(0xb9, float:2.59E-43)
            c3.a r0 = r0.mo2545u(r1, r1)
            ld.b r0 = (p205ld.C4265b) r0
            r1 = 1
            ld.b r0 = r0.m9577e0(r1)
            ld.b r3 = r3.m9580h0(r0)
            java.lang.String r0 = "thumbnail(\n             \u2026                        )"
            p214m2.C4339q.m9705j(r3, r0)
            return r3
    }
}
