package p124h7;

/* renamed from: h7.db */
/* loaded from: classes.dex */
public final class C2587db implements p124h7.InterfaceC2697jd<p124h7.C2752me> {

    /* renamed from: Y */
    public final /* synthetic */ int f11450Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f11451Z;

    /* renamed from: a0 */
    public final /* synthetic */ p124h7.C2624fc f11452a0;

    /* renamed from: b0 */
    public final /* synthetic */ p083f.C1933t f11453b0;

    public C2587db(p083f.C1933t r2, java.lang.String r3, p124h7.C2624fc r4, int r5) {
            r1 = this;
            r1.f11450Y = r5
            r0 = 1
            if (r5 == r0) goto L29
            r0 = 2
            if (r5 == r0) goto L1f
            r0 = 3
            if (r5 == r0) goto L15
            r1.f11453b0 = r2
            r1.f11451Z = r3
            r1.f11452a0 = r4
            r1.<init>()
            return
        L15:
            r1.f11453b0 = r2
            r1.f11451Z = r3
            r1.f11452a0 = r4
            r1.<init>()
            return
        L1f:
            r1.f11453b0 = r2
            r1.f11451Z = r3
            r1.f11452a0 = r4
            r1.<init>()
            return
        L29:
            r1.f11453b0 = r2
            r1.f11451Z = r3
            r1.f11452a0 = r4
            r1.<init>()
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public final void mo28b(p124h7.C2752me r4) {
            r3 = this;
            int r0 = r3.f11450Y
            switch(r0) {
                case 0: goto L3c;
                case 1: goto L21;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L55
        L6:
            h7.me r4 = (p124h7.C2752me) r4
            h7.af r0 = new h7.af
            r0.<init>()
            java.lang.String r1 = r4.f11773Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f11380Y = r1
            java.lang.String r1 = r3.f11451Z
            r0.m6468b(r1)
            f.t r1 = r3.f11453b0
            h7.fc r2 = r3.f11452a0
            p083f.C1933t.m4778F(r1, r2, r4, r0, r3)
            return
        L21:
            h7.me r4 = (p124h7.C2752me) r4
            h7.de r0 = new h7.de
            java.lang.String r4 = r4.f11773Z
            java.lang.String r1 = r3.f11451Z
            r2 = 2
            r0.<init>(r4, r1, r2)
            f.t r4 = r3.f11453b0
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r4.f8425Z
            h7.kd r4 = (p124h7.AbstractC2715kd) r4
            f.t r1 = new f.t
            r1.<init>(r3)
            r4.mo6616t(r0, r1)
            return
        L3c:
            h7.me r4 = (p124h7.C2752me) r4
            h7.fd r0 = new h7.fd
            java.lang.String r1 = r4.f11773Z
            r2 = 4
            r0.<init>(r1, r2)
            f.t r1 = r3.f11453b0
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r1.f8425Z
            h7.kd r1 = (p124h7.AbstractC2715kd) r1
            androidx.fragment.app.l0 r2 = new androidx.fragment.app.l0
            r2.<init>(r3, r3, r4)
            r1.mo6603g(r0, r2)
            return
        L55:
            h7.me r4 = (p124h7.C2752me) r4
            java.lang.String r0 = r4.f11773Z
            h7.af r1 = new h7.af
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f11380Y = r0
            java.lang.String r0 = r3.f11451Z
            r1.m6469c(r0)
            f.t r0 = r3.f11453b0
            h7.fc r2 = r3.f11452a0
            p083f.C1933t.m4778F(r0, r2, r4, r1, r3)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public final void mo29e(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f11450Y
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L10;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11452a0
            r0.mo6716d(r2)
            return
        L10:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11452a0
            r0.mo6716d(r2)
            return
        L1a:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11452a0
            r0.mo6716d(r2)
            return
        L24:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11452a0
            r0.mo6716d(r2)
            return
    }
}
