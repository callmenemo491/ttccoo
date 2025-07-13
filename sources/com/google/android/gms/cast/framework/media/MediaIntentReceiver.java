package com.google.android.gms.cast.framework.media;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public class MediaIntentReceiver extends android.content.BroadcastReceiver {

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";

    @androidx.annotation.RecentlyNonNull
    public static final java.lang.String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    public MediaIntentReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.android.gms.cast.framework.media.C1065b getRemoteMediaClient(com.google.android.gms.cast.framework.C1062a r6) {
            if (r6 == 0) goto L31
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            d6.r r0 = r6.f6834a
            r1 = 0
            if (r0 == 0) goto L29
            boolean r1 = r0.mo3821l()     // Catch: android.os.RemoteException -> L11
            goto L29
        L11:
            r0 = move-exception
            h6.b r2 = p052d6.AbstractC1303e.f6833b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "isConnected"
            r3[r1] = r4
            r4 = 1
            java.lang.Class<d6.r> r5 = p052d6.InterfaceC1329r.class
            java.lang.String r5 = r5.getSimpleName()
            r3[r4] = r5
            java.lang.String r4 = "Unable to call %s on %s."
            r2.m6377b(r0, r4, r3)
        L29:
            if (r1 != 0) goto L2c
            goto L31
        L2c:
            com.google.android.gms.cast.framework.media.b r6 = r6.m2979k()
            return r6
        L31:
            r6 = 0
            return r6
    }

    private void seek(com.google.android.gms.cast.framework.C1062a r9, long r10) {
            r8 = this;
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return
        L7:
            com.google.android.gms.cast.framework.media.b r9 = getRemoteMediaClient(r9)
            if (r9 == 0) goto L2c
            boolean r0 = r9.m3003j()
            if (r0 != 0) goto L2c
            boolean r0 = r9.m3007n()
            if (r0 == 0) goto L1a
            goto L2c
        L1a:
            long r0 = r9.m2995b()
            long r3 = r0 + r10
            c6.o r10 = new c6.o
            r6 = 0
            r5 = 0
            r7 = 0
            r2 = r10
            r2.<init>(r3, r5, r6, r7)
            r9.m3010q(r10)
        L2c:
            return
    }

    private void togglePlayback(com.google.android.gms.cast.framework.C1062a r1) {
            r0 = this;
            com.google.android.gms.cast.framework.media.b r1 = getRemoteMediaClient(r1)
            if (r1 != 0) goto L7
            return
        L7:
            r1.m3011r()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.content.Intent r11) {
            r9 = this;
            java.lang.String r0 = r11.getAction()
            if (r0 != 0) goto L7
            return
        L7:
            d6.a r1 = p052d6.C1295a.m3761b(r10)
            d6.f r1 = r1.m3763a()
            d6.e r2 = r1.m3771d()
            if (r2 != 0) goto L16
            return
        L16:
            int r3 = r0.hashCode()
            r4 = 0
            r5 = 1
            switch(r3) {
                case -1699820260: goto L66;
                case -945151566: goto L5c;
                case -945080078: goto L52;
                case -668151673: goto L48;
                case -124479363: goto L3e;
                case 235550565: goto L34;
                case 1362116196: goto L2a;
                case 1997055314: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L70
        L20:
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 7
            goto L71
        L2a:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.FORWARD"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 3
            goto L71
        L34:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 0
            goto L71
        L3e:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 6
            goto L71
        L48:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 5
            goto L71
        L52:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 2
            goto L71
        L5c:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 1
            goto L71
        L66:
            java.lang.String r3 = "com.google.android.gms.cast.framework.action.REWIND"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L70
            r3 = 4
            goto L71
        L70:
            r3 = -1
        L71:
            r6 = 0
            java.lang.String r8 = "googlecast-extra_skip_step_ms"
            switch(r3) {
                case 0: goto La0;
                case 1: goto L9c;
                case 2: goto L98;
                case 3: goto L90;
                case 4: goto L88;
                case 5: goto L84;
                case 6: goto L80;
                case 7: goto L7c;
                default: goto L78;
            }
        L78:
            r9.onReceiveOtherAction(r10, r0, r11)
            return
        L7c:
            r9.onReceiveActionMediaButton(r2, r11)
            return
        L80:
            r1.m3769b(r4)
            return
        L84:
            r1.m3769b(r5)
            return
        L88:
            long r10 = r11.getLongExtra(r8, r6)
            r9.onReceiveActionRewind(r2, r10)
            return
        L90:
            long r10 = r11.getLongExtra(r8, r6)
            r9.onReceiveActionForward(r2, r10)
            return
        L98:
            r9.onReceiveActionSkipPrev(r2)
            return
        L9c:
            r9.onReceiveActionSkipNext(r2)
            return
        La0:
            r9.onReceiveActionTogglePlayback(r2)
            return
    }

    public void onReceiveActionForward(@androidx.annotation.RecentlyNonNull p052d6.AbstractC1303e r2, long r3) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.cast.framework.C1062a
            if (r0 == 0) goto L9
            com.google.android.gms.cast.framework.a r2 = (com.google.android.gms.cast.framework.C1062a) r2
            r1.seek(r2, r3)
        L9:
            return
    }

    public void onReceiveActionMediaButton(@androidx.annotation.RecentlyNonNull p052d6.AbstractC1303e r3, @androidx.annotation.RecentlyNonNull android.content.Intent r4) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.cast.framework.C1062a
            if (r0 == 0) goto L32
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            boolean r1 = r4.hasExtra(r0)
            if (r1 != 0) goto Ld
            return
        Ld:
            android.os.Bundle r4 = r4.getExtras()
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r4, r1)
            java.lang.Object r4 = r4.get(r0)
            android.view.KeyEvent r4 = (android.view.KeyEvent) r4
            if (r4 == 0) goto L32
            int r0 = r4.getAction()
            if (r0 == 0) goto L25
            goto L32
        L25:
            int r4 = r4.getKeyCode()
            r0 = 85
            if (r4 != r0) goto L32
            com.google.android.gms.cast.framework.a r3 = (com.google.android.gms.cast.framework.C1062a) r3
            r2.togglePlayback(r3)
        L32:
            return
    }

    public void onReceiveActionRewind(@androidx.annotation.RecentlyNonNull p052d6.AbstractC1303e r2, long r3) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.cast.framework.C1062a
            if (r0 == 0) goto La
            com.google.android.gms.cast.framework.a r2 = (com.google.android.gms.cast.framework.C1062a) r2
            long r3 = -r3
            r1.seek(r2, r3)
        La:
            return
    }

    public void onReceiveActionSkipNext(@androidx.annotation.RecentlyNonNull p052d6.AbstractC1303e r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.cast.framework.C1062a
            if (r0 == 0) goto L2e
            com.google.android.gms.cast.framework.a r4 = (com.google.android.gms.cast.framework.C1062a) r4
            com.google.android.gms.cast.framework.media.b r4 = getRemoteMediaClient(r4)
            if (r4 == 0) goto L2e
            boolean r0 = r4.m3007n()
            if (r0 == 0) goto L13
            goto L2e
        L13:
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            boolean r0 = r4.m3016x()
            r1 = 0
            if (r0 != 0) goto L25
            r4 = 17
            com.google.android.gms.cast.framework.media.C1065b.m2993s(r4, r1)
            goto L2e
        L25:
            e6.j r0 = new e6.j
            r2 = 1
            r0.<init>(r4, r1, r2)
            com.google.android.gms.cast.framework.media.C1065b.m2994y(r0)
        L2e:
            return
    }

    public void onReceiveActionSkipPrev(@androidx.annotation.RecentlyNonNull p052d6.AbstractC1303e r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.cast.framework.C1062a
            if (r0 == 0) goto L2e
            com.google.android.gms.cast.framework.a r4 = (com.google.android.gms.cast.framework.C1062a) r4
            com.google.android.gms.cast.framework.media.b r4 = getRemoteMediaClient(r4)
            if (r4 == 0) goto L2e
            boolean r0 = r4.m3007n()
            if (r0 == 0) goto L13
            goto L2e
        L13:
            java.lang.String r0 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r0)
            boolean r0 = r4.m3016x()
            r1 = 0
            if (r0 != 0) goto L25
            r4 = 17
            com.google.android.gms.cast.framework.media.C1065b.m2993s(r4, r1)
            goto L2e
        L25:
            e6.j r0 = new e6.j
            r2 = 0
            r0.<init>(r4, r1, r2)
            com.google.android.gms.cast.framework.media.C1065b.m2994y(r0)
        L2e:
            return
    }

    public void onReceiveActionTogglePlayback(@androidx.annotation.RecentlyNonNull p052d6.AbstractC1303e r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.cast.framework.C1062a
            if (r0 == 0) goto L9
            com.google.android.gms.cast.framework.a r2 = (com.google.android.gms.cast.framework.C1062a) r2
            r1.togglePlayback(r2)
        L9:
            return
    }

    public void onReceiveOtherAction(android.content.Context r1, @androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull android.content.Intent r3) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onReceiveOtherAction(@androidx.annotation.RecentlyNonNull java.lang.String r2, @androidx.annotation.RecentlyNonNull android.content.Intent r3) {
            r1 = this;
            r0 = 0
            r1.onReceiveOtherAction(r0, r2, r3)
            return
    }
}
