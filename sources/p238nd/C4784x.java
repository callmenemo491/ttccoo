package p238nd;

/* renamed from: nd.x */
/* loaded from: classes.dex */
public final /* synthetic */ class C4784x implements androidx.lifecycle.InterfaceC0439e0 {

    /* renamed from: a */
    public final /* synthetic */ int f19152a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f19153b;

    public /* synthetic */ C4784x(ae.C0074c r2) {
            r1 = this;
            r0 = 4
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(ee.C1828f r2) {
            r1 = this;
            r0 = 5
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(je.C3583e r2) {
            r1 = this;
            r0 = 6
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(ke.C4100d r2) {
            r1 = this;
            r0 = 7
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p238nd.C4728b0 r2) {
            r1 = this;
            r0 = 0
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p257of.C5250d r2) {
            r1 = this;
            r0 = 10
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(sg.C6066a r2) {
            r1 = this;
            r0 = 13
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p359ud.C6379b r2) {
            r1 = this;
            r0 = 1
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(ve.C6652a r2) {
            r1 = this;
            r0 = 8
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p395wd.C6833b r2) {
            r1 = this;
            r0 = 2
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(wf.C6864k r2) {
            r1 = this;
            r0 = 11
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p416xe.C7043a r2) {
            r1 = this;
            r0 = 9
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p436yd.C7161f r2) {
            r1 = this;
            r0 = 3
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    public /* synthetic */ C4784x(p437yf.C7198b r2) {
            r1 = this;
            r0 = 12
            r1.f19152a = r0
            r1.<init>()
            r1.f19153b = r2
            return
    }

    @Override // androidx.lifecycle.InterfaceC0439e0
    /* renamed from: d */
    public final void mo124d(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f19152a
            r1 = 0
            r2 = 32
            r3 = 0
            java.lang.String r4 = "it"
            java.lang.String r5 = "this$0"
            switch(r0) {
                case 0: goto L1c7;
                case 1: goto L1a5;
                case 2: goto L191;
                case 3: goto L17f;
                case 4: goto L11f;
                case 5: goto L100;
                case 6: goto Lec;
                case 7: goto Lb5;
                case 8: goto L96;
                case 9: goto L7e;
                case 10: goto L66;
                case 11: goto L33;
                case 12: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto L1de
        Lf:
            java.lang.Object r0 = r6.f19153b
            yf.b r0 = (p437yf.C7198b) r0
            java.util.List r7 = (java.util.List) r7
            int r1 = p437yf.C7198b.f27715o1
            p214m2.C4339q.m9706k(r0, r5)
            T extends w1.a r1 = r0.f24171k1
            p214m2.C4339q.m9704i(r1)
            jd.y1 r1 = (p171jd.AbstractC3575y1) r1
            com.google.android.material.textfield.MaterialAutoCompleteTextView r1 = r1.f15663r
            rg.a r2 = new rg.a
            android.content.Context r0 = r0.m1334s0()
            p214m2.C4339q.m9705j(r7, r4)
            r2.<init>(r0, r7)
            r1.setAdapter(r2)
            return
        L33:
            java.lang.Object r0 = r6.f19153b
            wf.k r0 = (wf.C6864k) r0
            java.lang.String r7 = (java.lang.String) r7
            p214m2.C4339q.m9706k(r0, r5)
            java.lang.Runnable r7 = r0.f26647y
            if (r7 == 0) goto L47
            android.os.Handler r1 = r0.f26646x
            if (r1 == 0) goto L47
            r1.removeCallbacks(r7)
        L47:
            android.os.Handler r7 = r0.f26646x
            if (r7 == 0) goto L4e
            r7.removeMessages(r3)
        L4e:
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r7.<init>(r1)
            f1.f r1 = new f1.f
            r1.<init>(r0)
            r0.f26647y = r1
            r2 = 900(0x384, double:4.447E-321)
            r7.postDelayed(r1, r2)
            r0.f26646x = r7
            return
        L66:
            java.lang.Object r0 = r6.f19153b
            of.d r0 = (p257of.C5250d) r0
            java.lang.String r7 = (java.lang.String) r7
            int r1 = p257of.C5250d.f20390o1
            p214m2.C4339q.m9706k(r0, r5)
            T extends w1.a r0 = r0.f24171k1
            p214m2.C4339q.m9704i(r0)
            jd.o0 r0 = (p171jd.AbstractC3544o0) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15395s
            r0.setText(r7)
            return
        L7e:
            java.lang.Object r0 = r6.f19153b
            xe.a r0 = (p416xe.C7043a) r0
            java.lang.String r7 = (java.lang.String) r7
            int r1 = p416xe.C7043a.f27361q1
            p214m2.C4339q.m9706k(r0, r5)
            T extends w1.a r0 = r0.f24171k1
            p214m2.C4339q.m9704i(r0)
            jd.j2 r0 = (p171jd.AbstractC3526j2) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15259s
            r0.setText(r7)
            return
        L96:
            java.lang.Object r0 = r6.f19153b
            ve.a r0 = (ve.C6652a) r0
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            int r1 = ve.C6652a.f25862o1
            p214m2.C4339q.m9706k(r0, r5)
            T extends w1.a r0 = r0.f24171k1
            p214m2.C4339q.m9704i(r0)
            jd.v r0 = (p171jd.AbstractC3564v) r0
            com.google.android.material.button.MaterialButton r0 = r0.f15573r
            p214m2.C4339q.m9705j(r7, r4)
            boolean r7 = r7.booleanValue()
            r0.setEnabled(r7)
            return
        Lb5:
            java.lang.Object r0 = r6.f19153b
            ke.d r0 = (ke.C4100d) r0
            od.b0 r7 = (p255od.C5194b0) r7
            int r1 = ke.C4100d.f17032o1
            p214m2.C4339q.m9706k(r0, r5)
            T extends w1.a r0 = r0.f24171k1
            p214m2.C4339q.m9704i(r0)
            jd.q0 r0 = (p171jd.AbstractC3550q0) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15441r
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Balance "
            r1.append(r3)
            java.lang.String r3 = r7.getAmountString()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r7 = r7.getCurrency()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.setText(r7)
            return
        Lec:
            java.lang.Object r0 = r6.f19153b
            je.e r0 = (je.C3583e) r0
            java.util.List r7 = (java.util.List) r7
            int r2 = je.C3583e.f15701o1
            p214m2.C4339q.m9706k(r0, r5)
            b2.a<java.lang.Object> r0 = r0.f15704n1
            p214m2.C4339q.m9705j(r7, r4)
            r0.mo2202c(r7, r1, r1)
            return
        L100:
            java.lang.Object r0 = r6.f19153b
            ee.f r0 = (ee.C1828f) r0
            java.util.List r7 = (java.util.List) r7
            int r1 = ee.C1828f.f7959r1
            p214m2.C4339q.m9706k(r0, r5)
            ee.e r0 = r0.f7963p1
            p214m2.C4339q.m9705j(r7, r4)
            java.util.Objects.requireNonNull(r0)
            java.util.List r7 = p062dh.C1473i.m4009U(r7)
            r0.f7957f = r7
            androidx.recyclerview.widget.RecyclerView$f r7 = r0.f3228a
            r7.m1813b()
            return
        L11f:
            java.lang.Object r0 = r6.f19153b
            ae.c r0 = (ae.C0074c) r0
            ce.f r7 = (p041ce.C0955f) r7
            int r1 = ae.C0074c.f209p1
            p214m2.C4339q.m9706k(r0, r5)
            T extends w1.a r1 = r0.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.z r1 = (p171jd.C3576z) r1
            jd.j0 r1 = r1.f15670b
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15250e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.f4952Y
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r7.f4953Z
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.setText(r2)
            T extends w1.a r1 = r0.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.z r1 = (p171jd.C3576z) r1
            jd.j0 r1 = r1.f15673e
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15250e
            java.lang.String r2 = r7.f4956c0
            r1.setText(r2)
            T extends w1.a r1 = r0.f24168k1
            p214m2.C4339q.m9704i(r1)
            jd.z r1 = (p171jd.C3576z) r1
            jd.j0 r1 = r1.f15676h
            androidx.appcompat.widget.AppCompatTextView r1 = r1.f15250e
            java.lang.String r2 = r7.f4955b0
            r1.setText(r2)
            T extends w1.a r0 = r0.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.z r0 = (p171jd.C3576z) r0
            jd.j0 r0 = r0.f15675g
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15250e
            java.lang.String r7 = r7.f4957d0
            r0.setText(r7)
            return
        L17f:
            java.lang.Object r0 = r6.f19153b
            yd.f r0 = (p436yd.C7161f) r0
            android.support.v4.media.MediaMetadataCompat r7 = (android.support.v4.media.MediaMetadataCompat) r7
            p214m2.C4339q.m9706k(r0, r5)
            android.support.v4.media.session.PlaybackStateCompat r1 = r0.f27627g
            p214m2.C4339q.m9705j(r7, r4)
            r0.m14271d(r1, r7)
            return
        L191:
            java.lang.Object r0 = r6.f19153b
            wd.b r0 = (p395wd.C6833b) r0
            java.util.List r7 = (java.util.List) r7
            int r2 = p395wd.C6833b.f26579n1
            p214m2.C4339q.m9706k(r0, r5)
            b2.a<java.lang.Object> r0 = r0.f26581m1
            p214m2.C4339q.m9705j(r7, r4)
            r0.mo2202c(r7, r1, r1)
            return
        L1a5:
            java.lang.Object r0 = r6.f19153b
            ud.b r0 = (p359ud.C6379b) r0
            java.util.List r7 = (java.util.List) r7
            int r2 = p359ud.C6379b.f24858o1
            p214m2.C4339q.m9706k(r0, r5)
            b2.a<java.lang.Object> r0 = r0.f24860m1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = "String"
            r2[r3] = r5
            java.util.List r2 = p074e9.C1805a.m4533r(r2)
            p214m2.C4339q.m9705j(r7, r4)
            r2.addAll(r7)
            r0.mo2202c(r2, r1, r1)
            return
        L1c7:
            java.lang.Object r0 = r6.f19153b
            nd.b0 r0 = (p238nd.C4728b0) r0
            java.util.List r7 = (java.util.List) r7
            p214m2.C4339q.m9706k(r0, r5)
            java.util.List<id.b> r1 = r0.f18927w
            r1.clear()
            java.util.List<id.b> r0 = r0.f18927w
            p214m2.C4339q.m9705j(r7, r4)
            r0.addAll(r7)
            return
        L1de:
            java.lang.Object r0 = r6.f19153b
            sg.a r0 = (sg.C6066a) r0
            java.util.List r7 = (java.util.List) r7
            int r2 = sg.C6066a.f23417o1
            p214m2.C4339q.m9706k(r0, r5)
            b2.a<java.lang.Object> r0 = r0.f23419n1
            p214m2.C4339q.m9705j(r7, r4)
            r0.mo2202c(r7, r1, r1)
            return
    }
}
