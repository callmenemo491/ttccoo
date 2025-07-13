package p292qd;

/* renamed from: qd.i */
/* loaded from: classes.dex */
public final class C5625i {

    /* renamed from: a */
    public final android.content.Context f21890a;

    /* renamed from: b */
    public final p379vh.InterfaceC6733r f21891b;

    /* renamed from: c */
    public final p379vh.InterfaceC6686b0 f21892c;

    /* renamed from: d */
    public final p337t5.C6173c f21893d;

    /* renamed from: qd.i$a */
    public final class a implements p337t5.C6173c.d {

        /* renamed from: a */
        public final android.support.v4.media.session.MediaControllerCompat f21894a;

        /* renamed from: b */
        public android.net.Uri f21895b;

        /* renamed from: c */
        public android.graphics.Bitmap f21896c;

        /* renamed from: d */
        public final /* synthetic */ p292qd.C5625i f21897d;

        @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.media.UampNotificationManager$DescriptionAdapter$getCurrentLargeIcon$1", m7452f = "UampNotificationManager.kt", m7453l = {109}, m7454m = "invokeSuspend")
        /* renamed from: qd.i$a$a, reason: collision with other inner class name */
        public static final class C7418a extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

            /* renamed from: c0 */
            public java.lang.Object f21898c0;

            /* renamed from: d0 */
            public int f21899d0;

            /* renamed from: e0 */
            public final /* synthetic */ p292qd.C5625i.a f21900e0;

            /* renamed from: f0 */
            public final /* synthetic */ android.net.Uri f21901f0;

            /* renamed from: g0 */
            public final /* synthetic */ p337t5.C6173c.b f21902g0;

            public C7418a(p292qd.C5625i.a r1, android.net.Uri r2, p337t5.C6173c.b r3, p101fh.InterfaceC2172d<? super p292qd.C5625i.a.C7418a> r4) {
                    r0 = this;
                    r0.f21900e0 = r1
                    r0.f21901f0 = r2
                    r0.f21902g0 = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: h */
            public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r4, p101fh.InterfaceC2172d<?> r5) {
                    r3 = this;
                    qd.i$a$a r4 = new qd.i$a$a
                    qd.i$a r0 = r3.f21900e0
                    android.net.Uri r1 = r3.f21901f0
                    t5.c$b r2 = r3.f21902g0
                    r4.<init>(r0, r1, r2, r5)
                    return r4
            }

            @Override // mh.InterfaceC4624p
            /* renamed from: l */
            public java.lang.Object mo122l(p379vh.InterfaceC6686b0 r4, p101fh.InterfaceC2172d<? super ch.C0985l> r5) {
                    r3 = this;
                    vh.b0 r4 = (p379vh.InterfaceC6686b0) r4
                    fh.d r5 = (p101fh.InterfaceC2172d) r5
                    qd.i$a$a r4 = new qd.i$a$a
                    qd.i$a r0 = r3.f21900e0
                    android.net.Uri r1 = r3.f21901f0
                    t5.c$b r2 = r3.f21902g0
                    r4.<init>(r0, r1, r2, r5)
                    ch.l r5 = ch.C0985l.f5061a
                    java.lang.Object r4 = r4.mo123o(r5)
                    return r4
            }

            @Override // p134hh.AbstractC3040a
            /* renamed from: o */
            public final java.lang.Object mo123o(java.lang.Object r8) {
                    r7 = this;
                    gh.a r0 = gh.EnumC2389a.f10764Y
                    int r1 = r7.f21899d0
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r3) goto L12
                    java.lang.Object r0 = r7.f21898c0
                    qd.i$a r0 = (p292qd.C5625i.a) r0
                    p074e9.C1805a.m4540y(r8)
                    goto L3c
                L12:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1a:
                    p074e9.C1805a.m4540y(r8)
                    qd.i$a r8 = r7.f21900e0
                    android.net.Uri r1 = r7.f21901f0
                    if (r1 == 0) goto L40
                    r7.f21898c0 = r8
                    r7.f21899d0 = r3
                    java.util.Objects.requireNonNull(r8)
                    vh.z r4 = p379vh.C6716l0.f26008b
                    qd.j r5 = new qd.j
                    qd.i r6 = r8.f21897d
                    r5.<init>(r6, r1, r2)
                    java.lang.Object r1 = p101fh.C2174f.m5710A(r4, r5, r7)
                    if (r1 != r0) goto L3a
                    return r0
                L3a:
                    r0 = r8
                    r8 = r1
                L3c:
                    r2 = r8
                    android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                    r8 = r0
                L40:
                    r8.f21896c = r2
                    qd.i$a r8 = r7.f21900e0
                    android.graphics.Bitmap r8 = r8.f21896c
                    if (r8 == 0) goto L5b
                    t5.c$b r0 = r7.f21902g0
                    java.util.Objects.requireNonNull(r0)
                    t5.c r1 = r0.f23943b
                    int r0 = r0.f23942a
                    android.os.Handler r1 = r1.f23922g
                    r2 = -1
                    android.os.Message r8 = r1.obtainMessage(r3, r0, r2, r8)
                    r8.sendToTarget()
                L5b:
                    ch.l r8 = ch.C0985l.f5061a
                    return r8
            }
        }

        public a(p292qd.C5625i r1, android.support.v4.media.session.MediaControllerCompat r2) {
                r0 = this;
                r0.f21897d = r1
                r0.<init>()
                r0.f21894a = r2
                return
        }

        @Override // p337t5.C6173c.d
        /* renamed from: a */
        public android.app.PendingIntent mo11925a(p088f4.InterfaceC2054x0 r1) {
                r0 = this;
                android.support.v4.media.session.MediaControllerCompat r1 = r0.f21894a
                android.support.v4.media.session.MediaControllerCompat$b r1 = r1.f505a
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r1 = (android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21) r1
                android.media.session.MediaController r1 = r1.f507a
                android.app.PendingIntent r1 = r1.getSessionActivity()
                return r1
        }

        @Override // p337t5.C6173c.d
        /* renamed from: b */
        public /* synthetic */ java.lang.CharSequence mo11926b(p088f4.InterfaceC2054x0 r1) {
                r0 = this;
                java.lang.CharSequence r1 = p337t5.C6174d.m12744a(r0, r1)
                return r1
        }

        @Override // p337t5.C6173c.d
        /* renamed from: c */
        public java.lang.CharSequence mo11927c(p088f4.InterfaceC2054x0 r1) {
                r0 = this;
                android.support.v4.media.session.MediaControllerCompat r1 = r0.f21894a
                android.support.v4.media.MediaMetadataCompat r1 = r1.m259a()
                android.support.v4.media.MediaDescriptionCompat r1 = r1.m230d()
                java.lang.CharSequence r1 = r1.f487a0
                java.lang.String r1 = java.lang.String.valueOf(r1)
                return r1
        }

        @Override // p337t5.C6173c.d
        /* renamed from: d */
        public android.graphics.Bitmap mo11928d(p088f4.InterfaceC2054x0 r9, p337t5.C6173c.b r10) {
                r8 = this;
                android.support.v4.media.session.MediaControllerCompat r9 = r8.f21894a
                android.support.v4.media.MediaMetadataCompat r9 = r9.m259a()
                android.support.v4.media.MediaDescriptionCompat r9 = r9.m230d()
                android.net.Uri r9 = r9.f490d0
                android.net.Uri r0 = r8.f21895b
                boolean r0 = p214m2.C4339q.m9702c(r0, r9)
                r1 = 0
                if (r0 == 0) goto L1c
                android.graphics.Bitmap r0 = r8.f21896c
                if (r0 != 0) goto L1a
                goto L1c
            L1a:
                r1 = r0
                goto L2e
            L1c:
                r8.f21895b = r9
                qd.i r0 = r8.f21897d
                vh.b0 r2 = r0.f21892c
                r3 = 0
                qd.i$a$a r5 = new qd.i$a$a
                r5.<init>(r8, r9, r10, r1)
                r6 = 3
                r7 = 0
                r4 = 0
                p101fh.C2174f.m5728r(r2, r3, r4, r5, r6, r7)
            L2e:
                return r1
        }

        @Override // p337t5.C6173c.d
        /* renamed from: e */
        public java.lang.CharSequence mo11929e(p088f4.InterfaceC2054x0 r1) {
                r0 = this;
                android.support.v4.media.session.MediaControllerCompat r1 = r0.f21894a
                android.support.v4.media.MediaMetadataCompat r1 = r1.m259a()
                android.support.v4.media.MediaDescriptionCompat r1 = r1.m230d()
                java.lang.CharSequence r1 = r1.f486Z
                java.lang.String r1 = java.lang.String.valueOf(r1)
                return r1
        }
    }

    public C5625i(android.content.Context r22, android.support.v4.media.session.MediaSessionCompat.Token r23, p337t5.C6173c.f r24) {
            r21 = this;
            r0 = r21
            r2 = r22
            r15 = r23
            r21.<init>()
            r0.f21890a = r2
            r1 = 0
            r3 = 1
            vh.r r1 = p209lh.C4304a.m9607a(r1, r3)
            r0.f21891b = r1
            vh.z r3 = p379vh.C6716l0.f26007a
            vh.k1 r3 = p459zh.C7346l.f28106a
            fh.g r1 = r3.plus(r1)
            vh.b0 r1 = p101fh.C2174f.m5711a(r1)
            r0.f21892c = r1
            java.lang.String r1 = "notification"
            java.lang.Object r3 = r2.getSystemService(r1)
            java.lang.String r4 = "null cannot be cast to non-null type android.app.NotificationManager"
            java.util.Objects.requireNonNull(r3, r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            android.support.v4.media.session.MediaControllerCompat r3 = new android.support.v4.media.session.MediaControllerCompat
            r3.<init>(r2, r15)
            r4 = 45881(0xb339, float:6.4293E-41)
            java.lang.String r5 = "io.tacocrypto.app.media.NOW_PLAYING"
            r6 = 2
            r9 = 2131230967(0x7f0800f7, float:1.8078002E38)
            r10 = 2131230966(0x7f0800f6, float:1.8078E38)
            r11 = 2131230971(0x7f0800fb, float:1.807801E38)
            r16 = 2131230965(0x7f0800f5, float:1.8077998E38)
            r7 = 2131951945(0x7f130149, float:1.9540319E38)
            r8 = 2131951946(0x7f13014a, float:1.954032E38)
            qd.i$a r12 = new qd.i$a
            r12.<init>(r0, r3)
            r13 = 2131231231(0x7f0801ff, float:1.8078537E38)
            r17 = 0
            int r3 = p371v5.C6552b0.f25624a
            r14 = 26
            if (r3 < r14) goto L77
            java.lang.Object r1 = r2.getSystemService(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            java.util.Objects.requireNonNull(r1)
            android.app.NotificationChannel r3 = new android.app.NotificationChannel
            java.lang.String r7 = r2.getString(r7)
            r3.<init>(r5, r7, r6)
            java.lang.String r6 = r2.getString(r8)
            r3.setDescription(r6)
            r1.createNotificationChannel(r3)
        L77:
            t5.c r14 = new t5.c
            r7 = 0
            r18 = 0
            r19 = 2131230968(0x7f0800f8, float:1.8078004E38)
            r1 = r14
            r2 = r22
            r3 = r5
            r5 = r12
            r6 = r24
            r8 = r13
            r12 = 0
            r13 = r17
            r20 = r14
            r14 = r19
            r15 = r16
            r16 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r20
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r1.f23936u
            r3 = r23
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 != 0) goto Laa
            r1.f23936u = r3
            boolean r2 = r1.f23934s
            if (r2 == 0) goto Laa
            r1.m12737b()
        Laa:
            r0.f21893d = r1
            return
    }
}
