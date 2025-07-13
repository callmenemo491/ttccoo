package p071e6;

/* renamed from: e6.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1524b0 implements p201l6.InterfaceC4189i {

    /* renamed from: a */
    public final /* synthetic */ int f7400a;

    /* renamed from: b */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.C1064a f7401b;

    public /* synthetic */ C1524b0(com.google.android.gms.cast.framework.media.C1064a r2, int r3) {
            r1 = this;
            r1.f7400a = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f7401b = r2
            return
        Lb:
            r1.<init>()
            r1.f7401b = r2
            return
    }

    @Override // p201l6.InterfaceC4189i
    /* renamed from: a */
    public final void mo2866a(p201l6.InterfaceC4188h r10) {
            r9 = this;
            int r0 = r9.f7400a
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 1
            r4 = 0
            r5 = 2
            r6 = 0
            switch(r0) {
                case 0: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4d
        Lc:
            com.google.android.gms.cast.framework.media.a r0 = r9.f7401b
            com.google.android.gms.cast.framework.media.b$c r10 = (com.google.android.gms.cast.framework.media.C1065b.c) r10
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.api.Status r10 = r10.mo3030F()
            int r7 = r10.f5536Z
            if (r7 == 0) goto L34
            h6.b r8 = r0.f5474a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r4] = r7
            java.lang.String r10 = r10.f5537a0
            r5[r3] = r10
            java.lang.String r10 = "Error fetching queue item ids, statusCode=%s, statusMessage=%s"
            java.lang.String r10 = java.lang.String.format(r10, r5)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r8.m6379d(r10, r3)
        L34:
            r0.f5485l = r6
            java.util.Deque<java.lang.Integer> r10 = r0.f5481h
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L4c
            android.os.Handler r10 = r0.f5482i
            java.util.TimerTask r3 = r0.f5483j
            r10.removeCallbacks(r3)
            android.os.Handler r10 = r0.f5482i
            java.util.TimerTask r0 = r0.f5483j
            r10.postDelayed(r0, r1)
        L4c:
            return
        L4d:
            com.google.android.gms.cast.framework.media.a r0 = r9.f7401b
            com.google.android.gms.cast.framework.media.b$c r10 = (com.google.android.gms.cast.framework.media.C1065b.c) r10
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.api.Status r10 = r10.mo3030F()
            int r7 = r10.f5536Z
            if (r7 == 0) goto L75
            h6.b r8 = r0.f5474a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r4] = r7
            java.lang.String r10 = r10.f5537a0
            r5[r3] = r10
            java.lang.String r10 = "Error fetching queue items, statusCode=%s, statusMessage=%s"
            java.lang.String r10 = java.lang.String.format(r10, r5)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r8.m6379d(r10, r3)
        L75:
            r0.f5484k = r6
            java.util.Deque<java.lang.Integer> r10 = r0.f5481h
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L8d
            android.os.Handler r10 = r0.f5482i
            java.util.TimerTask r3 = r0.f5483j
            r10.removeCallbacks(r3)
            android.os.Handler r10 = r0.f5482i
            java.util.TimerTask r0 = r0.f5483j
            r10.postDelayed(r0, r1)
        L8d:
            return
    }
}
