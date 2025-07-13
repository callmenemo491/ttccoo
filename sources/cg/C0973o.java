package cg;

/* renamed from: cg.o */
/* loaded from: classes.dex */
public final class C0973o extends android.database.ContentObserver {

    /* renamed from: a */
    public final android.content.Context f5042a;

    /* renamed from: b */
    public final mh.InterfaceC4620l<java.lang.Integer, ch.C0985l> f5043b;

    /* renamed from: c */
    public int f5044c;

    public C0973o(android.content.Context r1, android.os.Handler r2, mh.InterfaceC4620l<? super java.lang.Integer, ch.C0985l> r3) {
            r0 = this;
            r0.<init>(r2)
            r0.f5042a = r1
            r0.f5043b = r3
            java.lang.String r2 = "audio"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.media.AudioManager"
            java.util.Objects.requireNonNull(r1, r2)
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r2 = 3
            int r1 = r1.getStreamVolume(r2)
            r0.f5044c = r1
            return
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2) {
            r1 = this;
            super.onChange(r2)
            android.content.Context r2 = r1.f5042a
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.media.AudioManager"
            java.util.Objects.requireNonNull(r2, r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r0 = 3
            int r2 = r2.getStreamVolume(r0)
            int r0 = r1.f5044c
            if (r0 == r2) goto L24
            mh.l<java.lang.Integer, ch.l> r0 = r1.f5043b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo107b(r2)
        L24:
            return
    }
}
