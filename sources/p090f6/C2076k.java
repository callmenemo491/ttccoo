package p090f6;

/* renamed from: f6.k */
/* loaded from: classes.dex */
public final class C2076k extends android.support.v4.media.session.MediaSessionCompat.AbstractC0161a {

    /* renamed from: d0 */
    public final /* synthetic */ p090f6.C2077l f9481d0;

    public C2076k(p090f6.C2077l r1) {
            r0 = this;
            r0.f9481d0 = r1
            r0.<init>()
            return
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
    /* renamed from: I */
    public final void mo303I(long r8) {
            r7 = this;
            c6.o r6 = new c6.o
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r3, r4, r5)
            f6.l r8 = r7.f9481d0
            com.google.android.gms.cast.framework.media.b r8 = r8.f9491i
            r8.m3010q(r6)
            return
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
    /* renamed from: r */
    public final boolean mo321r(android.content.Intent r3) {
            r2 = this;
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            android.os.Parcelable r3 = r3.getParcelableExtra(r0)
            android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            if (r3 == 0) goto L21
            int r0 = r3.getKeyCode()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 == r1) goto L1a
            int r3 = r3.getKeyCode()
            r0 = 126(0x7e, float:1.77E-43)
            if (r3 != r0) goto L21
        L1a:
            f6.l r3 = r2.f9481d0
            com.google.android.gms.cast.framework.media.b r3 = r3.f9491i
            r3.m3011r()
        L21:
            r3 = 1
            return r3
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
    /* renamed from: s */
    public final void mo322s() {
            r1 = this;
            f6.l r0 = r1.f9481d0
            com.google.android.gms.cast.framework.media.b r0 = r0.f9491i
            r0.m3011r()
            return
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.AbstractC0161a
    /* renamed from: w */
    public final void mo323w() {
            r1 = this;
            f6.l r0 = r1.f9481d0
            com.google.android.gms.cast.framework.media.b r0 = r0.f9491i
            r0.m3011r()
            return
    }
}
