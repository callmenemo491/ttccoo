package cg;

/* renamed from: cg.h */
/* loaded from: classes.dex */
public final class C0966h extends td.AbstractC6218f<p171jd.C3572x1> {

    /* renamed from: t1 */
    public static final /* synthetic */ int f4989t1 = 0;

    /* renamed from: m1 */
    public final cg.C0959a f4990m1;

    /* renamed from: n1 */
    public final boolean f4991n1;

    /* renamed from: o1 */
    public final ch.InterfaceC0977d f4992o1;

    /* renamed from: p1 */
    public final ch.InterfaceC0977d f4993p1;

    /* renamed from: q1 */
    public com.google.android.material.bottomsheet.BottomSheetBehavior<?> f4994q1;

    /* renamed from: r1 */
    public final ch.InterfaceC0977d f4995r1;

    /* renamed from: s1 */
    public final cg.C0966h.b f4996s1;

    /* renamed from: cg.h$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<android.media.AudioManager> {

        /* renamed from: Z */
        public final /* synthetic */ cg.C0966h f4997Z;

        public a(cg.C0966h r1) {
                r0 = this;
                r0.f4997Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public android.media.AudioManager mo15e() {
                r2 = this;
                cg.h r0 = r2.f4997Z
                android.content.Context r0 = r0.m1334s0()
                java.lang.String r1 = "audio"
                java.lang.Object r0 = r0.getSystemService(r1)
                java.lang.String r1 = "null cannot be cast to non-null type android.media.AudioManager"
                java.util.Objects.requireNonNull(r0, r1)
                android.media.AudioManager r0 = (android.media.AudioManager) r0
                return r0
        }
    }

    /* renamed from: cg.h$b */
    public static final class b extends com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d {

        /* renamed from: a */
        public final /* synthetic */ cg.C0966h f4998a;

        public b(cg.C0966h r1) {
                r0 = this;
                r0.f4998a = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d
        /* renamed from: a */
        public void mo2682a(android.view.View r5, float r6) {
                r4 = this;
                cg.h r5 = r4.f4998a
                int r0 = cg.C0966h.f4989t1
                T extends w1.a r5 = r5.f24168k1
                p214m2.C4339q.m9704i(r5)
                jd.x1 r5 = (p171jd.C3572x1) r5
                jd.w1 r5 = r5.f15645b
                r0 = 4
                float r0 = (float) r0
                float r1 = r6 * r0
                r2 = 1072064102(0x3fe66666, float:1.8)
                float r1 = r1 - r2
                r2 = 1
                float r2 = (float) r2
                float r2 = r2 - r6
                float r2 = r2 * r0
                r0 = 1073741824(0x40000000, float:2.0)
                float r0 = r2 - r0
                r3 = 1075000115(0x40133333, float:2.3)
                float r2 = r2 - r3
                android.widget.LinearLayout r3 = r5.f15611e
                r3.setAlpha(r1)
                androidx.appcompat.widget.LinearLayoutCompat r1 = r5.f15612f
                r1.setAlpha(r0)
                androidx.appcompat.widget.AppCompatTextView r0 = r5.f15618l
                r0.setAlpha(r2)
                androidx.appcompat.widget.AppCompatImageView r5 = r5.f15609c
                r0 = 180(0xb4, float:2.52E-43)
                float r0 = (float) r0
                float r0 = r0 * r6
                r5.setRotation(r0)
                return
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC1131d
        /* renamed from: b */
        public void mo2683b(android.view.View r1, int r2) {
                r0 = this;
                return
        }
    }

    /* renamed from: cg.h$c */
    public static final class c extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<cg.C0960b, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ cg.C0966h f4999Z;

        public c(cg.C0966h r1) {
                r0 = this;
                r0.f4999Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(cg.C0960b r14) {
                r13 = this;
                cg.b r14 = (cg.C0960b) r14
                java.lang.String r0 = "clickedItem"
                p214m2.C4339q.m9706k(r14, r0)
                cg.h r0 = r13.f4999Z
                int r1 = cg.C0966h.f4989t1
                cg.l r0 = r0.m2681Q0()
                r1 = 2
                java.util.Objects.requireNonNull(r0)
                java.lang.String r2 = "mediaItemData"
                p214m2.C4339q.m9706k(r14, r2)
                gd.a r2 = r0.f5031t
                androidx.lifecycle.d0<android.support.v4.media.MediaMetadataCompat> r2 = r2.f10570d
                java.lang.Object r2 = r2.m1411d()
                android.support.v4.media.MediaMetadataCompat r2 = (android.support.v4.media.MediaMetadataCompat) r2
                gd.a r3 = r0.f5031t
                android.support.v4.media.session.MediaControllerCompat$e r3 = r3.m6085a()
                gd.a r4 = r0.f5031t
                androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r4 = r4.f10569c
                java.lang.Object r4 = r4.m1411d()
                android.support.v4.media.session.PlaybackStateCompat r4 = (android.support.v4.media.session.PlaybackStateCompat) r4
                r5 = 3
                r6 = 6
                r7 = 1
                r8 = 0
                if (r4 == 0) goto L42
                int r4 = r4.f564Y
                if (r4 == r6) goto L40
                if (r4 == r5) goto L40
                if (r4 != r1) goto L42
            L40:
                r4 = 1
                goto L43
            L42:
                r4 = 0
            L43:
                r9 = 0
                if (r4 == 0) goto L98
                java.lang.String r4 = r14.f4961a
                if (r2 == 0) goto L51
                java.lang.String r10 = "android.media.metadata.MEDIA_ID"
                java.lang.String r2 = r2.m231e(r10)
                goto L52
            L51:
                r2 = r9
            L52:
                boolean r2 = p214m2.C4339q.m9702c(r4, r2)
                if (r2 == 0) goto L98
                gd.a r14 = r0.f5031t
                androidx.lifecycle.d0<android.support.v4.media.session.PlaybackStateCompat> r14 = r14.f10569c
                java.lang.Object r14 = r14.m1411d()
                android.support.v4.media.session.PlaybackStateCompat r14 = (android.support.v4.media.session.PlaybackStateCompat) r14
                if (r14 == 0) goto La1
                int r0 = r14.f564Y
                if (r0 == r6) goto L6d
                if (r0 != r5) goto L6b
                goto L6d
            L6b:
                r2 = 0
                goto L6e
            L6d:
                r2 = 1
            L6e:
                if (r2 == 0) goto L78
                android.support.v4.media.session.MediaControllerCompat$f r3 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r3
                android.media.session.MediaController$TransportControls r14 = r3.f520a
                r14.pause()
                goto La1
            L78:
                long r4 = r14.f568c0
                r9 = 4
                long r9 = r9 & r4
                r11 = 0
                int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r14 != 0) goto L8e
                r9 = 512(0x200, double:2.53E-321)
                long r4 = r4 & r9
                int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r14 == 0) goto L8d
                if (r0 != r1) goto L8d
                goto L8e
            L8d:
                r7 = 0
            L8e:
                if (r7 == 0) goto La1
                android.support.v4.media.session.MediaControllerCompat$f r3 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r3
                android.media.session.MediaController$TransportControls r14 = r3.f520a
                r14.play()
                goto La1
            L98:
                java.lang.String r14 = r14.f4961a
                android.support.v4.media.session.MediaControllerCompat$f r3 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r3
                android.media.session.MediaController$TransportControls r0 = r3.f520a
                r0.playFromMediaId(r14, r9)
            La1:
                ch.l r14 = ch.C0985l.f5061a
                return r14
        }
    }

    /* renamed from: cg.h$d */
    public static final class d extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<cg.C0973o> {

        /* renamed from: Z */
        public final /* synthetic */ cg.C0966h f5000Z;

        public d(cg.C0966h r1) {
                r0 = this;
                r0.f5000Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public cg.C0973o mo15e() {
                r5 = this;
                cg.o r0 = new cg.o
                cg.h r1 = r5.f5000Z
                android.content.Context r1 = r1.m1334s0()
                android.content.Context r1 = r1.getApplicationContext()
                java.lang.String r2 = "requireContext().applicationContext"
                p214m2.C4339q.m9705j(r1, r2)
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r2.<init>(r3)
                cg.i r3 = new cg.i
                cg.h r4 = r5.f5000Z
                r3.<init>(r4)
                r0.<init>(r1, r2, r3)
                return r0
        }
    }

    /* renamed from: cg.h$e */
    public static final class e extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ cg.C0966h f5001Z;

        public e(cg.C0966h r1) {
                r0 = this;
                r0.f5001Z = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r4) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r4, r0)
                cg.h r4 = r3.f5001Z
                int r0 = cg.C0966h.f4989t1
                cg.l r4 = r4.m2681Q0()
                gd.a r4 = r4.f5031t
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                cg.m r1 = cg.C0971m.f5040Z
                java.lang.String r2 = " io.tacocrypto.app.mymusicservice.COMMAND.REFRESH"
                r4.m6086b(r2, r0, r1)
                cg.h r4 = r3.f5001Z
                r0 = 0
                r1 = 2
                java.lang.String r2 = "refreshing..."
                vg.C6664e.m13512m(r4, r2, r0, r1)
                ch.l r4 = ch.C0985l.f5061a
                return r4
        }
    }

    /* renamed from: cg.h$f */
    public static final class f implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ cg.C0966h f5002a;

        public f(cg.C0966h r1) {
                r0 = this;
                r0.f5002a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
                r1 = this;
                cg.h r2 = r1.f5002a
                int r4 = cg.C0966h.f4989t1
                android.media.AudioManager r2 = r2.m2680P0()
                r4 = 3
                r0 = 0
                r2.setStreamVolume(r4, r3, r0)
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: cg.h$g */
    public static final class g implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        public final /* synthetic */ cg.C0966h f5003a;

        public g(cg.C0966h r1) {
                r0 = this;
                r0.f5003a = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar r1) {
                r0 = this;
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar r7) {
                r6 = this;
                if (r7 == 0) goto L30
                int r7 = r7.getProgress()
                cg.h r0 = r6.f5003a
                int r1 = cg.C0966h.f4989t1
                cg.l r0 = r0.m2681Q0()
                gd.a r1 = r0.f5031t
                android.support.v4.media.session.MediaControllerCompat$e r1 = r1.m6085a()
                androidx.lifecycle.d0<cg.l$a> r0 = r0.f5017f
                java.lang.Object r0 = r0.m1411d()
                cg.l$a r0 = (cg.C0970l.a) r0
                if (r0 != 0) goto L1f
                goto L30
            L1f:
                long r2 = r0.f5036e
                long r4 = (long) r7
                long r2 = r2 * r4
                double r2 = (double) r2
                r4 = 4636737291354636288(0x4059000000000000, double:100.0)
                double r2 = r2 / r4
                long r2 = (long) r2
                android.support.v4.media.session.MediaControllerCompat$f r1 = (android.support.v4.media.session.MediaControllerCompat.C0153f) r1
                android.media.session.MediaController$TransportControls r7 = r1.f520a
                r7.seekTo(r2)
            L30:
                return
        }
    }

    /* renamed from: cg.h$h */
    public static final class h extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.fragment.app.ComponentCallbacksC0395n> {

        /* renamed from: Z */
        public final /* synthetic */ androidx.fragment.app.ComponentCallbacksC0395n f5004Z;

        public h(androidx.fragment.app.ComponentCallbacksC0395n r1) {
                r0 = this;
                r0.f5004Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.fragment.app.ComponentCallbacksC0395n mo15e() {
                r1 = this;
                androidx.fragment.app.n r0 = r1.f5004Z
                return r0
        }
    }

    /* renamed from: cg.h$i */
    public static final class i extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.C0467s0> {

        /* renamed from: Z */
        public final /* synthetic */ mh.InterfaceC4609a f5005Z;

        public i(mh.InterfaceC4609a r1) {
                r0 = this;
                r0.f5005Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.C0467s0 mo15e() {
                r2 = this;
                mh.a r0 = r2.f5005Z
                java.lang.Object r0 = r0.mo15e()
                androidx.lifecycle.t0 r0 = (androidx.lifecycle.InterfaceC0469t0) r0
                androidx.lifecycle.s0 r0 = r0.mo432o()
                java.lang.String r1 = "ownerProducer().viewModelStore"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: cg.h$j */
    public /* synthetic */ class j extends p239nh.C4829i implements mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3572x1> {

        /* renamed from: g0 */
        public static final cg.C0966h.j f5006g0 = null;

        static {
                cg.h$j r0 = new cg.h$j
                r0.<init>()
                cg.C0966h.j.f5006g0 = r0
                return
        }

        public j() {
                r6 = this;
                java.lang.Class<jd.x1> r2 = p171jd.C3572x1.class
                r1 = 3
                java.lang.String r3 = "inflate"
                java.lang.String r4 = "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/tacocrypto/app/databinding/ToolNftPlayerFragmentBinding;"
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // mh.InterfaceC4625q
        /* renamed from: i */
        public p171jd.C3572x1 mo115i(android.view.LayoutInflater r40, android.view.ViewGroup r41, java.lang.Boolean r42) {
                r39 = this;
                r0 = r40
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1 = r41
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = r42
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                java.lang.String r3 = "p0"
                p214m2.C4339q.m9706k(r0, r3)
                r3 = 2131558680(0x7f0d0118, float:1.8742683E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r1, r4)
                if (r2 == 0) goto L22
                r1.addView(r0)
            L22:
                r1 = 2131361930(0x7f0a008a, float:1.8343626E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                java.lang.String r3 = "Missing required view with ID: "
                if (r2 == 0) goto L1ba
                r1 = 2131361897(0x7f0a0069, float:1.834356E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r7 = r4
                android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
                if (r7 == 0) goto L1a8
                r1 = 2131361898(0x7f0a006a, float:1.8343561E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r8 = r4
                androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
                if (r8 == 0) goto L1a8
                r9 = r2
                com.google.android.material.card.MaterialCardView r9 = (com.google.android.material.card.MaterialCardView) r9
                r1 = 2131361994(0x7f0a00ca, float:1.8343756E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r10 = r4
                androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
                if (r10 == 0) goto L1a8
                r1 = 2131361996(0x7f0a00cc, float:1.834376E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r11 = r4
                androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
                if (r11 == 0) goto L1a8
                r1 = 2131362053(0x7f0a0105, float:1.8343876E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r12 = r4
                android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
                if (r12 == 0) goto L1a8
                r1 = 2131362057(0x7f0a0109, float:1.8343884E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r13 = r4
                androidx.appcompat.widget.LinearLayoutCompat r13 = (androidx.appcompat.widget.LinearLayoutCompat) r13
                if (r13 == 0) goto L1a8
                r1 = 2131362077(0x7f0a011d, float:1.8343924E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r14 = r4
                androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
                if (r14 == 0) goto L1a8
                r1 = 2131362256(0x7f0a01d0, float:1.8344287E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r15 = r4
                androidx.appcompat.widget.AppCompatImageView r15 = (androidx.appcompat.widget.AppCompatImageView) r15
                if (r15 == 0) goto L1a8
                r1 = 2131362262(0x7f0a01d6, float:1.83443E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r16 = r4
                androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
                if (r16 == 0) goto L1a8
                r1 = 2131362290(0x7f0a01f2, float:1.8344356E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r17 = r4
                androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
                if (r17 == 0) goto L1a8
                r1 = 2131362439(0x7f0a0287, float:1.8344659E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r18 = r4
                androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
                if (r18 == 0) goto L1a8
                r1 = 2131362440(0x7f0a0288, float:1.834466E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r19 = r4
                androidx.appcompat.widget.AppCompatTextView r19 = (androidx.appcompat.widget.AppCompatTextView) r19
                if (r19 == 0) goto L1a8
                r1 = 2131362494(0x7f0a02be, float:1.834477E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r20 = r4
                androidx.appcompat.widget.AppCompatImageView r20 = (androidx.appcompat.widget.AppCompatImageView) r20
                if (r20 == 0) goto L1a8
                r1 = 2131362595(0x7f0a0323, float:1.8344975E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r21 = r4
                androidx.appcompat.widget.AppCompatImageView r21 = (androidx.appcompat.widget.AppCompatImageView) r21
                if (r21 == 0) goto L1a8
                r1 = 2131362597(0x7f0a0325, float:1.834498E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r22 = r4
                androidx.appcompat.widget.AppCompatImageView r22 = (androidx.appcompat.widget.AppCompatImageView) r22
                if (r22 == 0) goto L1a8
                r1 = 2131362598(0x7f0a0326, float:1.8344981E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r23 = r4
                androidx.appcompat.widget.AppCompatImageView r23 = (androidx.appcompat.widget.AppCompatImageView) r23
                if (r23 == 0) goto L1a8
                r1 = 2131362637(0x7f0a034d, float:1.834506E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r24 = r4
                androidx.appcompat.widget.AppCompatTextView r24 = (androidx.appcompat.widget.AppCompatTextView) r24
                if (r24 == 0) goto L1a8
                r1 = 2131362728(0x7f0a03a8, float:1.8345245E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r25 = r4
                androidx.appcompat.widget.AppCompatSeekBar r25 = (androidx.appcompat.widget.AppCompatSeekBar) r25
                if (r25 == 0) goto L1a8
                r1 = 2131362760(0x7f0a03c8, float:1.834531E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r26 = r4
                androidx.appcompat.widget.AppCompatImageView r26 = (androidx.appcompat.widget.AppCompatImageView) r26
                if (r26 == 0) goto L1a8
                r1 = 2131362761(0x7f0a03c9, float:1.8345312E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r27 = r4
                androidx.appcompat.widget.AppCompatSeekBar r27 = (androidx.appcompat.widget.AppCompatSeekBar) r27
                if (r27 == 0) goto L1a8
                r1 = 2131362762(0x7f0a03ca, float:1.8345314E38)
                android.view.View r4 = p064e.C1494h.m4055f(r2, r1)
                r28 = r4
                androidx.appcompat.widget.AppCompatImageView r28 = (androidx.appcompat.widget.AppCompatImageView) r28
                if (r28 == 0) goto L1a8
                jd.w1 r31 = new jd.w1
                r5 = r31
                r6 = r9
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                r1 = 2131361981(0x7f0a00bd, float:1.834373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r32 = r2
                androidx.appcompat.widget.AppCompatImageView r32 = (androidx.appcompat.widget.AppCompatImageView) r32
                if (r32 == 0) goto L1ba
                r1 = 2131362127(0x7f0a014f, float:1.8344026E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r33 = r2
                androidx.appcompat.widget.AppCompatTextView r33 = (androidx.appcompat.widget.AppCompatTextView) r33
                if (r33 == 0) goto L1ba
                r1 = 2131362225(0x7f0a01b1, float:1.8344225E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r34 = r2
                com.google.android.material.card.MaterialCardView r34 = (com.google.android.material.card.MaterialCardView) r34
                if (r34 == 0) goto L1ba
                r1 = 2131362298(0x7f0a01fa, float:1.8344373E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r35 = r2
                androidx.recyclerview.widget.RecyclerView r35 = (androidx.recyclerview.widget.RecyclerView) r35
                if (r35 == 0) goto L1ba
                r1 = 2131362525(0x7f0a02dd, float:1.8344833E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r36 = r2
                androidx.appcompat.widget.AppCompatImageView r36 = (androidx.appcompat.widget.AppCompatImageView) r36
                if (r36 == 0) goto L1ba
                r1 = 2131362646(0x7f0a0356, float:1.8345078E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r37 = r2
                androidx.swiperefreshlayout.widget.SwipeRefreshLayout r37 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r37
                if (r37 == 0) goto L1ba
                r1 = 2131362710(0x7f0a0396, float:1.8345208E38)
                android.view.View r2 = p064e.C1494h.m4055f(r0, r1)
                r38 = r2
                androidx.appcompat.widget.AppCompatTextView r38 = (androidx.appcompat.widget.AppCompatTextView) r38
                if (r38 == 0) goto L1ba
                jd.x1 r1 = new jd.x1
                r30 = r0
                androidx.constraintlayout.widget.ConstraintLayout r30 = (androidx.constraintlayout.widget.ConstraintLayout) r30
                r29 = r1
                r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
                return r1
            L1a8:
                android.content.res.Resources r0 = r2.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r0 = r3.concat(r0)
                r1.<init>(r0)
                throw r1
            L1ba:
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getResourceName(r1)
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r0 = r3.concat(r0)
                r1.<init>(r0)
                throw r1
        }
    }

    /* renamed from: cg.h$k */
    public static final class k extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<androidx.lifecycle.InterfaceC0461p0> {

        /* renamed from: Z */
        public final /* synthetic */ cg.C0966h f5007Z;

        public k(cg.C0966h r1) {
                r0 = this;
                r0.f5007Z = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public androidx.lifecycle.InterfaceC0461p0 mo15e() {
                r1 = this;
                cg.h r0 = r1.f5007Z
                vg.i r0 = p185k7.C3828h5.m8599n(r0)
                return r0
        }
    }

    public C0966h() {
            r4 = this;
            r4.<init>()
            cg.a r0 = new cg.a
            cg.h$c r1 = new cg.h$c
            r1.<init>(r4)
            r0.<init>(r1)
            r4.f4990m1 = r0
            r0 = 1
            r4.f4991n1 = r0
            cg.h$k r0 = new cg.h$k
            r0.<init>(r4)
            cg.h$h r1 = new cg.h$h
            r1.<init>(r4)
            java.lang.Class<cg.l> r2 = cg.C0970l.class
            sh.b r2 = p239nh.C4838r.m10853a(r2)
            cg.h$i r3 = new cg.h$i
            r3.<init>(r1)
            ch.d r0 = androidx.fragment.app.C0420z0.m1404a(r4, r2, r3, r0)
            r4.f4992o1 = r0
            cg.h$a r0 = new cg.h$a
            r0.<init>(r4)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r4.f4993p1 = r0
            cg.h$d r0 = new cg.h$d
            r0.<init>(r4)
            ch.d r0 = p185k7.C4038x4.m9096i(r0)
            r4.f4995r1 = r0
            cg.h$b r0 = new cg.h$b
            r0.<init>(r4)
            r4.f4996s1 = r0
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: L0 */
    public void mo108L0() {
            r4 = this;
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f5015d
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 0
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.d0<cg.l$a> r0 = r0.f5017f
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 1
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.d0<java.lang.Long> r0 = r0.f5018g
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 2
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.LiveData<java.lang.Integer> r0 = r0.f5019h
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 3
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.d0<java.lang.Boolean> r0 = r0.f5020i
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 4
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.LiveData<java.lang.Boolean> r0 = r0.f5022k
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 5
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            cg.l r0 = r4.m2681Q0()
            androidx.lifecycle.LiveData<java.util.List<cg.b>> r0 = r0.f5024m
            androidx.lifecycle.v r1 = r4.m1311O()
            cg.g r2 = new cg.g
            r3 = 6
            r2.<init>(r4, r3)
            r0.m1413f(r1, r2)
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: M0 */
    public void mo109M0() {
            r6 = this;
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x1 r0 = (p171jd.C3572x1) r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15650g
            of.e r2 = new of.e
            r2.<init>(r6)
            r1.setOnRefreshListener(r2)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r0.f15650g
            r2 = 0
            r1.setEnabled(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15646c
            cg.f r3 = new cg.f
            r3.<init>(r6, r2)
            r1.setOnClickListener(r3)
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15651h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.tacocrypto.app.ui.secret.c r3 = io.tacocrypto.app.p156ui.secret.EnumC3251c.f14351r0
            java.lang.String r4 = " Tool"
            p206le.C4271b.m9585a(r3, r1, r4, r0)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x1 r0 = (p171jd.C3572x1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15648e
            vg.t r1 = new vg.t
            android.content.Context r3 = r6.m1334s0()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r4 = "requireContext().applicationContext"
            p214m2.C4339q.m9705j(r3, r4)
            r4 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r5 = 4
            r1.<init>(r3, r4, r2, r5)
            r0.m1754g(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x1 r0 = (p171jd.C3572x1) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15648e
            cg.a r1 = r6.f4990m1
            r0.setAdapter(r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x1 r0 = (p171jd.C3572x1) r0
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15649f
            java.lang.String r1 = "binding.refreshIcon"
            p214m2.C4339q.m9705j(r0, r1)
            cg.h$e r1 = new cg.h$e
            r1.<init>(r6)
            r2 = 1000(0x3e8, float:1.401E-42)
            vg.C6664e.m13508i(r0, r2, r1)
            T extends w1.a r0 = r6.f24168k1
            p214m2.C4339q.m9704i(r0)
            jd.x1 r0 = (p171jd.C3572x1) r0
            jd.w1 r0 = r0.f15645b
            android.widget.FrameLayout r1 = r0.f15608b
            cg.f r2 = new cg.f
            r3 = 1
            r2.<init>(r6, r3)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatSeekBar r1 = r0.f15625s
            android.media.AudioManager r2 = r6.m2680P0()
            r3 = 3
            int r2 = r2.getStreamMaxVolume(r3)
            r1.setMax(r2)
            androidx.appcompat.widget.AppCompatSeekBar r1 = r0.f15625s
            android.media.AudioManager r2 = r6.m2680P0()
            int r2 = r2.getStreamVolume(r3)
            r1.setProgress(r2)
            androidx.appcompat.widget.AppCompatSeekBar r1 = r0.f15625s
            cg.h$f r2 = new cg.h$f
            r2.<init>(r6)
            r1.setOnSeekBarChangeListener(r2)
            androidx.appcompat.widget.AppCompatSeekBar r1 = r0.f15624r
            cg.h$g r2 = new cg.h$g
            r2.<init>(r6)
            r1.setOnSeekBarChangeListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15619m
            cg.f r2 = new cg.f
            r4 = 2
            r2.<init>(r6, r4)
            r1.setOnClickListener(r2)
            androidx.cardview.widget.CardView r1 = r0.f15610d
            cg.f r2 = new cg.f
            r2.<init>(r6, r3)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15621o
            cg.f r2 = new cg.f
            r2.<init>(r6, r5)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15620n
            cg.f r2 = new cg.f
            r3 = 5
            r2.<init>(r6, r3)
            r1.setOnClickListener(r2)
            androidx.appcompat.widget.AppCompatImageView r1 = r0.f15622p
            cg.f r2 = new cg.f
            r3 = 6
            r2.<init>(r6, r3)
            r1.setOnClickListener(r2)
            com.google.android.material.card.MaterialCardView r1 = r0.f15607a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f
            r3 = 0
            if (r2 == 0) goto Lfd
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0341f) r1
            goto Lfe
        Lfd:
            r1 = r3
        Lfe:
            if (r1 == 0) goto L103
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r1.f1930a
            goto L104
        L103:
            r1 = r3
        L104:
            boolean r2 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r2 == 0) goto L10b
            r3 = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
        L10b:
            if (r3 == 0) goto L124
            r6.f4994q1 = r3
            r3.m3284D(r5)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r0.f15612f
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            android.widget.LinearLayout r1 = r0.f15611e
            r2 = 0
            r1.setAlpha(r2)
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f15609c
            r0.setRotation(r2)
        L124:
            return
    }

    @Override // td.AbstractC6213a
    /* renamed from: N0 */
    public mh.InterfaceC4625q<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, p171jd.C3572x1> mo110N0() {
            r2 = this;
            cg.h$j r0 = cg.C0966h.j.f5006g0
            java.lang.String r1 = "bindingInflater"
            p214m2.C4339q.m9706k(r0, r1)
            return r0
    }

    @Override // td.AbstractC6218f
    /* renamed from: O0 */
    public boolean mo111O0() {
            r1 = this;
            boolean r0 = r1.f4991n1
            return r0
    }

    /* renamed from: P0 */
    public final android.media.AudioManager m2680P0() {
            r1 = this;
            ch.d r0 = r1.f4993p1
            java.lang.Object r0 = r0.getValue()
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            return r0
    }

    /* renamed from: Q0 */
    public final cg.C0970l m2681Q0() {
            r1 = this;
            ch.d r0 = r1.f4992o1
            java.lang.Object r0 = r0.getValue()
            cg.l r0 = (cg.C0970l) r0
            return r0
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0391l, androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: V */
    public void mo114V(android.os.Bundle r4) {
            r3 = this;
            super.mo114V(r4)
            cg.l r4 = r3.m2681Q0()
            gd.a r4 = r4.f5031t
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            cg.n r1 = cg.C0972n.f5041Z
            java.lang.String r2 = " io.tacocrypto.app.mymusicservice.COMMAND.REFRESH_IF_EMPTY"
            r4.m6086b(r2, r0, r1)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: c0 */
    public void mo1320c0() {
            r2 = this;
            r0 = 1
            r2.f2258A0 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r2.f4994q1
            if (r0 == 0) goto Le
            cg.h$b r1 = r2.f4996s1
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$d> r0 = r0.f5833P
            r0.remove(r1)
        Le:
            android.content.Context r0 = r2.m1334s0()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            ch.d r1 = r2.f4995r1
            java.lang.Object r1 = r1.getValue()
            cg.o r1 = (cg.C0973o) r1
            r0.unregisterContentObserver(r1)
            return
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0395n
    /* renamed from: e0 */
    public void mo1322e0() {
            r4 = this;
            r0 = 1
            r4.f2258A0 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r4.f4994q1
            if (r1 == 0) goto Lc
            cg.h$b r2 = r4.f4996s1
            r1.m3294s(r2)
        Lc:
            android.content.Context r1 = r4.m1334s0()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.ContentResolver r1 = r1.getContentResolver()
            android.net.Uri r2 = android.provider.Settings.System.CONTENT_URI
            ch.d r3 = r4.f4995r1
            java.lang.Object r3 = r3.getValue()
            cg.o r3 = (cg.C0973o) r3
            r1.registerContentObserver(r2, r0, r3)
            return
    }
}
