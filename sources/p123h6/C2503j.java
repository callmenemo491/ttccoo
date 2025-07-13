package p123h6;

/* renamed from: h6.j */
/* loaded from: classes.dex */
public final class C2503j implements p123h6.InterfaceC2509p {

    /* renamed from: Y */
    public final /* synthetic */ int f11298Y;

    /* renamed from: Z */
    public final /* synthetic */ p123h6.InterfaceC2509p f11299Z;

    /* renamed from: a0 */
    public final /* synthetic */ p123h6.C2507n f11300a0;

    public C2503j(p123h6.C2507n r2, p123h6.InterfaceC2509p r3, int r4) {
            r1 = this;
            r1.f11298Y = r4
            r0 = 1
            if (r4 == r0) goto Ld
            r1.f11300a0 = r2
            r1.f11299Z = r3
            r1.<init>()
            return
        Ld:
            r1.f11300a0 = r2
            r1.f11299Z = r3
            r1.<init>()
            return
    }

    @Override // p123h6.InterfaceC2509p
    /* renamed from: m */
    public final void mo3032m(long r2) {
            r1 = this;
            int r0 = r1.f11298Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            h6.p r0 = r1.f11299Z
            if (r0 == 0) goto Ld
            r0.mo3032m(r2)
        Ld:
            return
        Le:
            h6.p r0 = r1.f11299Z
            if (r0 == 0) goto L15
            r0.mo3032m(r2)
        L15:
            return
    }

    @Override // p123h6.InterfaceC2509p
    /* renamed from: t */
    public final void mo3033t(long r5, int r7, java.lang.Object r8) {
            r4 = this;
            int r0 = r4.f11298Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L13
        L6:
            h6.n r0 = r4.f11300a0
            r1 = 0
            r0.f11306g = r1
            h6.p r0 = r4.f11299Z
            if (r0 == 0) goto L12
            r0.mo3033t(r5, r7, r8)
        L12:
            return
        L13:
            h6.p r0 = r4.f11299Z
            if (r0 == 0) goto L5b
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r7 != r0) goto L56
            h6.n r7 = r4.f11300a0
            h6.b r1 = r7.f11332a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r7 = r7.f11308i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r3] = r7
            java.lang.String r7 = r1.f11253a
            java.lang.String r3 = "Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d"
            java.lang.String r1 = r1.m6380e(r3, r2)
            android.util.Log.w(r7, r1)
            h6.n r7 = r4.f11300a0
            h6.k r7 = r7.f11307h
            com.google.android.gms.cast.framework.media.i r7 = (com.google.android.gms.cast.framework.media.C1072i) r7
            com.google.android.gms.cast.framework.media.b r7 = r7.f5505a
            java.util.List<com.google.android.gms.cast.framework.media.b$a> r7 = r7.f5495h
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r7.next()
            com.google.android.gms.cast.framework.media.b$a r1 = (com.google.android.gms.cast.framework.media.C1065b.a) r1
            r1.mo3023w()
            goto L44
        L54:
            r7 = 2001(0x7d1, float:2.804E-42)
        L56:
            h6.p r0 = r4.f11299Z
            r0.mo3033t(r5, r7, r8)
        L5b:
            return
    }
}
