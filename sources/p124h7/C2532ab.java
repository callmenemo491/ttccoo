package p124h7;

/* renamed from: h7.ab */
/* loaded from: classes.dex */
public final class C2532ab implements p124h7.InterfaceC2697jd<p124h7.C2573cf> {

    /* renamed from: Y */
    public final /* synthetic */ int f11370Y;

    /* renamed from: Z */
    public final /* synthetic */ p124h7.C2624fc f11371Z;

    /* renamed from: a0 */
    public final /* synthetic */ p083f.C1933t f11372a0;

    public C2532ab(p083f.C1933t r1, p124h7.C2624fc r2, int r3) {
            r0 = this;
            r0.f11370Y = r3
            switch(r3) {
                case 1: goto L4e;
                case 2: goto L46;
                case 3: goto L3e;
                case 4: goto L36;
                case 5: goto L2e;
                case 6: goto L26;
                case 7: goto L1e;
                case 8: goto L16;
                case 9: goto Le;
                case 10: goto L6;
                default: goto L5;
            }
        L5:
            goto L56
        L6:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        Le:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L16:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L1e:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L26:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L2e:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L36:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L3e:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L46:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L4e:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
        L56:
            r0.f11372a0 = r1
            r0.f11371Z = r2
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public final void mo28b(p124h7.C2573cf r11) {
            r10 = this;
            int r0 = r10.f11370Y
            r1 = 0
            java.lang.String r2 = "Bearer"
            switch(r0) {
                case 0: goto L152;
                case 1: goto L11c;
                case 2: goto Le2;
                case 3: goto Lc1;
                case 4: goto La5;
                case 5: goto L84;
                case 6: goto L63;
                case 7: goto L4a;
                case 8: goto L31;
                case 9: goto La;
                default: goto L8;
            }
        L8:
            goto L16f
        La:
            h7.kf r11 = (p124h7.C2717kf) r11
            java.lang.String r0 = r11.f11724n0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L1e
            f.t r0 = r10.f11372a0
            h7.fc r1 = r10.f11371Z
            p083f.C1933t.m4777E(r0, r11, r1, r10)
            goto L30
        L1e:
            h7.fc r0 = r10.f11371Z
            h7.ya r1 = new h7.ya
            java.lang.String r2 = r11.f11724n0
            java.util.List<h7.oe> r3 = r11.f11723m0
            v9.j0 r11 = r11.m6949a()
            r1.<init>(r2, r3, r11)
            r0.m6715c(r1)
        L30:
            return
        L31:
            h7.me r11 = (p124h7.C2752me) r11
            java.lang.String r11 = r11.f11773Z
            h7.fd r0 = new h7.fd
            r1 = 3
            r0.<init>(r11, r1)
            f.t r11 = r10.f11372a0
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r11 = r11.f8425Z
            h7.kd r11 = (p124h7.AbstractC2715kd) r11
            h7.hd r1 = new h7.hd
            r1.<init>(r10, r10)
            r11.mo6598b(r0, r1)
            return
        L4a:
            h7.me r11 = (p124h7.C2752me) r11
            java.lang.String r0 = r11.f11773Z
            h7.fd r1 = new h7.fd
            r2 = 4
            r1.<init>(r0, r2)
            f.t r0 = r10.f11372a0
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r0.f8425Z
            h7.kd r0 = (p124h7.AbstractC2715kd) r0
            androidx.fragment.app.l0 r2 = new androidx.fragment.app.l0
            r2.<init>(r10, r10, r11)
            r0.mo6603g(r1, r2)
            return
        L63:
            h7.ce r11 = (p124h7.C2572ce) r11
            java.lang.String r0 = r11.f11422Y
            long r0 = p052d6.C1310h0.m3800b(r0)
            h7.me r4 = new h7.me
            java.lang.String r3 = r11.f11423Z
            java.lang.String r11 = r11.f11422Y
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.<init>(r3, r11, r0, r2)
            f.t r3 = r10.f11372a0
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            h7.fc r7 = r10.f11371Z
            r8 = r10
            p083f.C1933t.m4776D(r3, r4, r5, r6, r7, r8)
            return
        L84:
            h7.lf r11 = (p124h7.C2735lf) r11
            h7.me r4 = new h7.me
            java.lang.String r0 = r11.f11752Z
            java.lang.String r1 = r11.f11751Y
            long r5 = r11.f11753a0
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4.<init>(r0, r1, r3, r2)
            f.t r3 = r10.f11372a0
            r5 = 0
            boolean r11 = r11.f11754b0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            h7.fc r7 = r10.f11371Z
            r8 = r10
            p083f.C1933t.m4776D(r3, r4, r5, r6, r7, r8)
            return
        La5:
            h7.me r11 = (p124h7.C2752me) r11
            h7.af r0 = new h7.af
            r0.<init>()
            java.lang.String r2 = r11.f11773Z
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0.f11380Y = r2
            r0.m6468b(r1)
            r0.m6469c(r1)
            f.t r1 = r10.f11372a0
            h7.fc r2 = r10.f11371Z
            p083f.C1933t.m4778F(r1, r2, r11, r0, r10)
            return
        Lc1:
            h7.pf r11 = (p124h7.C2807pf) r11
            h7.me r4 = new h7.me
            java.lang.String r0 = r11.f11837Z
            java.lang.String r1 = r11.f11836Y
            long r5 = r11.f11838a0
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r4.<init>(r0, r1, r3, r2)
            f.t r3 = r10.f11372a0
            r5 = 0
            boolean r11 = r11.f11839b0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            h7.fc r7 = r10.f11371Z
            r8 = r10
            p083f.C1933t.m4776D(r3, r4, r5, r6, r7, r8)
            return
        Le2:
            h7.zd r11 = (p124h7.C2985zd) r11
            java.lang.String r0 = r11.f12070d0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lfd
            h7.fc r0 = r10.f11371Z
            h7.ya r2 = new h7.ya
            java.lang.String r3 = r11.f12070d0
            java.util.List<h7.oe> r11 = r11.f12069c0
            r2.<init>(r3, r11, r1)
            r0.m6715c(r2)
            goto L11b
        Lfd:
            h7.me r5 = new h7.me
            java.lang.String r0 = r11.f12066Z
            java.lang.String r1 = r11.f12065Y
            long r3 = r11.f12068b0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5.<init>(r0, r1, r3, r2)
            f.t r4 = r10.f11372a0
            r6 = 0
            boolean r11 = r11.f12067a0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            h7.fc r8 = r10.f11371Z
            r9 = r10
            p083f.C1933t.m4776D(r4, r5, r6, r7, r8, r9)
        L11b:
            return
        L11c:
            h7.nf r11 = (p124h7.C2771nf) r11
            java.lang.String r0 = r11.f11793c0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L137
            h7.fc r0 = r10.f11371Z
            h7.ya r2 = new h7.ya
            java.lang.String r3 = r11.f11793c0
            java.util.List<h7.oe> r11 = r11.f11792b0
            r2.<init>(r3, r11, r1)
            r0.m6715c(r2)
            goto L151
        L137:
            h7.me r5 = new h7.me
            java.lang.String r0 = r11.f11790Z
            java.lang.String r1 = r11.f11789Y
            long r3 = r11.f11791a0
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            r5.<init>(r0, r1, r11, r2)
            f.t r4 = r10.f11372a0
            r6 = 0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            h7.fc r8 = r10.f11371Z
            r9 = r10
            p083f.C1933t.m4776D(r4, r5, r6, r7, r8, r9)
        L151:
            return
        L152:
            h7.cf r11 = (p124h7.C2573cf) r11
            h7.me r4 = new h7.me
            java.lang.String r0 = r11.f11425Z
            java.lang.String r1 = r11.f11424Y
            long r5 = r11.f11426a0
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r4.<init>(r0, r1, r11, r2)
            f.t r3 = r10.f11372a0
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            h7.fc r7 = r10.f11371Z
            r8 = r10
            p083f.C1933t.m4776D(r3, r4, r5, r6, r7, r8)
            return
        L16f:
            h7.cf r11 = (p124h7.C2573cf) r11
            h7.me r4 = new h7.me
            java.lang.String r0 = r11.f11425Z
            java.lang.String r1 = r11.f11424Y
            long r5 = r11.f11426a0
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r4.<init>(r0, r1, r11, r2)
            f.t r3 = r10.f11372a0
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            h7.fc r7 = r10.f11371Z
            r8 = r10
            p083f.C1933t.m4776D(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public final void mo29e(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f11370Y
            switch(r0) {
                case 0: goto L60;
                case 1: goto L56;
                case 2: goto L4c;
                case 3: goto L42;
                case 4: goto L38;
                case 5: goto L2e;
                case 6: goto L24;
                case 7: goto L1a;
                case 8: goto L10;
                case 9: goto L6;
                default: goto L5;
            }
        L5:
            goto L6a
        L6:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L10:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L1a:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L24:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L2e:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L38:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L42:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L4c:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L56:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L60:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
        L6a:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            h7.fc r0 = r1.f11371Z
            r0.mo6716d(r2)
            return
    }
}
