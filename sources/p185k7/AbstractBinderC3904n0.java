package p185k7;

/* renamed from: k7.n0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3904n0 extends p185k7.BinderC3753c0 implements p185k7.InterfaceC3917o0 {
    public AbstractBinderC3904n0() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"
            r1.<init>(r0)
            return
    }

    public static p185k7.InterfaceC3917o0 asInterface(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p185k7.InterfaceC3917o0
            if (r1 == 0) goto L11
            k7.o0 r0 = (p185k7.InterfaceC3917o0) r0
            return r0
        L11:
            k7.m0 r0 = new k7.m0
            r0.<init>(r2)
            return r0
    }

    @Override // p185k7.BinderC3753c0
    /* renamed from: v */
    public final boolean mo8231v(int r13, android.os.Parcel r14, android.os.Parcel r15, int r16) {
            r12 = this;
            r8 = r12
            r0 = r14
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r9 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r4 = 0
            switch(r13) {
                case 1: goto L43a;
                case 2: goto L40a;
                case 3: goto L3d7;
                case 4: goto L3ae;
                case 5: goto L380;
                case 6: goto L35f;
                case 7: goto L352;
                case 8: goto L341;
                case 9: goto L32c;
                case 10: goto L307;
                case 11: goto L2f5;
                case 12: goto L2ec;
                case 13: goto L2e3;
                case 14: goto L2da;
                case 15: goto L2c0;
                case 16: goto L2a3;
                case 17: goto L286;
                case 18: goto L267;
                case 19: goto L24a;
                case 20: goto L22d;
                case 21: goto L210;
                case 22: goto L1f3;
                case 23: goto L1e6;
                case 24: goto L1d9;
                case 25: goto L1c8;
                case 26: goto L1b7;
                case 27: goto L19e;
                case 28: goto L18d;
                case 29: goto L17c;
                case 30: goto L16b;
                case 31: goto L142;
                case 32: goto L119;
                case 33: goto Lf3;
                case 34: goto Ld6;
                case 35: goto Lb9;
                case 36: goto L9c;
                case 37: goto L91;
                case 38: goto L70;
                case 39: goto L62;
                case 40: goto L45;
                case 41: goto Lc;
                case 42: goto L38;
                case 43: goto L2f;
                case 44: goto L1e;
                case 45: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r2
        Ld:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = p185k7.C3767d0.m8366a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConsentThirdParty(r1, r2)
            goto L451
        L1e:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = p185k7.C3767d0.m8366a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConsent(r1, r2)
            goto L451
        L2f:
            long r0 = r14.readLong()
            r12.clearMeasurementEnabled(r0)
            goto L451
        L38:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = p185k7.C3767d0.m8366a(r14, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r12.setDefaultEventParameters(r0)
            goto L451
        L45:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L4c
            goto L5d
        L4c:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L58
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L5d
        L58:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L5d:
            r12.isDataCollectionEnabled(r4)
            goto L451
        L62:
            java.lang.ClassLoader r1 = p185k7.C3767d0.f16553a
            int r0 = r14.readInt()
            if (r0 == 0) goto L6b
            r2 = 1
        L6b:
            r12.setDataCollectionEnabled(r2)
            goto L451
        L70:
            android.os.IBinder r1 = r14.readStrongBinder()
            if (r1 != 0) goto L77
            goto L88
        L77:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof p185k7.InterfaceC3956r0
            if (r3 == 0) goto L83
            r4 = r2
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L88
        L83:
            k7.p0 r4 = new k7.p0
            r4.<init>(r1)
        L88:
            int r0 = r14.readInt()
            r12.getTestFlag(r4, r0)
            goto L451
        L91:
            java.lang.ClassLoader r1 = p185k7.C3767d0.f16553a
            java.util.HashMap r0 = r14.readHashMap(r1)
            r12.initForTests(r0)
            goto L451
        L9c:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto La3
            goto Lb4
        La3:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p185k7.InterfaceC3995u0
            if (r2 == 0) goto Laf
            r4 = r1
            k7.u0 r4 = (p185k7.InterfaceC3995u0) r4
            goto Lb4
        Laf:
            k7.s0 r4 = new k7.s0
            r4.<init>(r0)
        Lb4:
            r12.mo3128x89e2096d(r4)
            goto L451
        Lb9:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto Lc0
            goto Ld1
        Lc0:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p185k7.InterfaceC3995u0
            if (r2 == 0) goto Lcc
            r4 = r1
            k7.u0 r4 = (p185k7.InterfaceC3995u0) r4
            goto Ld1
        Lcc:
            k7.s0 r4 = new k7.s0
            r4.<init>(r0)
        Ld1:
            r12.mo3127x37dae114(r4)
            goto L451
        Ld6:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto Ldd
            goto Lee
        Ldd:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p185k7.InterfaceC3995u0
            if (r2 == 0) goto Le9
            r4 = r1
            k7.u0 r4 = (p185k7.InterfaceC3995u0) r4
            goto Lee
        Le9:
            k7.s0 r4 = new k7.s0
            r4.<init>(r0)
        Lee:
            r12.setEventInterceptor(r4)
            goto L451
        Lf3:
            int r1 = r14.readInt()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r3 = r14.readStrongBinder()
            x6.a r3 = p408x6.InterfaceC6957a.a.m14123x(r3)
            android.os.IBinder r4 = r14.readStrongBinder()
            x6.a r4 = p408x6.InterfaceC6957a.a.m14123x(r4)
            android.os.IBinder r0 = r14.readStrongBinder()
            x6.a r5 = p408x6.InterfaceC6957a.a.m14123x(r0)
            r0 = r12
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L451
        L119:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = p185k7.C3767d0.m8366a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r2 = r14.readStrongBinder()
            if (r2 != 0) goto L128
            goto L139
        L128:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p185k7.InterfaceC3956r0
            if (r4 == 0) goto L134
            r4 = r3
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L139
        L134:
            k7.p0 r4 = new k7.p0
            r4.<init>(r2)
        L139:
            long r2 = r14.readLong()
            r12.performAction(r1, r4, r2)
            goto L451
        L142:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            android.os.IBinder r2 = r14.readStrongBinder()
            if (r2 != 0) goto L151
            goto L162
        L151:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p185k7.InterfaceC3956r0
            if (r4 == 0) goto L15d
            r4 = r3
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L162
        L15d:
            k7.p0 r4 = new k7.p0
            r4.<init>(r2)
        L162:
            long r2 = r14.readLong()
            r12.onActivitySaveInstanceState(r1, r4, r2)
            goto L451
        L16b:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            long r2 = r14.readLong()
            r12.onActivityResumed(r1, r2)
            goto L451
        L17c:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            long r2 = r14.readLong()
            r12.onActivityPaused(r1, r2)
            goto L451
        L18d:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            long r2 = r14.readLong()
            r12.onActivityDestroyed(r1, r2)
            goto L451
        L19e:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = p185k7.C3767d0.m8366a(r14, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r14.readLong()
            r12.onActivityCreated(r1, r2, r3)
            goto L451
        L1b7:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            long r2 = r14.readLong()
            r12.onActivityStopped(r1, r2)
            goto L451
        L1c8:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            long r2 = r14.readLong()
            r12.onActivityStarted(r1, r2)
            goto L451
        L1d9:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.endAdUnitExposure(r1, r2)
            goto L451
        L1e6:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.beginAdUnitExposure(r1, r2)
            goto L451
        L1f3:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L1fa
            goto L20b
        L1fa:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L206
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L20b
        L206:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L20b:
            r12.generateEventId(r4)
            goto L451
        L210:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L217
            goto L228
        L217:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L223
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L228
        L223:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L228:
            r12.getGmpAppId(r4)
            goto L451
        L22d:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L234
            goto L245
        L234:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L240
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L245
        L240:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L245:
            r12.getAppInstanceId(r4)
            goto L451
        L24a:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L251
            goto L262
        L251:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L25d
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L262
        L25d:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L262:
            r12.getCachedAppInstanceId(r4)
            goto L451
        L267:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L26e
            goto L281
        L26e:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p185k7.InterfaceC4021w0
            if (r2 == 0) goto L27c
            r4 = r1
            k7.w0 r4 = (p185k7.InterfaceC4021w0) r4
            goto L281
        L27c:
            k7.v0 r4 = new k7.v0
            r4.<init>(r0)
        L281:
            r12.setInstanceIdProvider(r4)
            goto L451
        L286:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L28d
            goto L29e
        L28d:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L299
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L29e
        L299:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L29e:
            r12.getCurrentScreenClass(r4)
            goto L451
        L2a3:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L2aa
            goto L2bb
        L2aa:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof p185k7.InterfaceC3956r0
            if (r2 == 0) goto L2b6
            r4 = r1
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L2bb
        L2b6:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L2bb:
            r12.getCurrentScreenName(r4)
            goto L451
        L2c0:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            java.lang.String r2 = r14.readString()
            java.lang.String r3 = r14.readString()
            long r4 = r14.readLong()
            r0 = r12
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L451
        L2da:
            long r0 = r14.readLong()
            r12.setSessionTimeoutDuration(r0)
            goto L451
        L2e3:
            long r0 = r14.readLong()
            r12.setMinimumSessionDuration(r0)
            goto L451
        L2ec:
            long r0 = r14.readLong()
            r12.resetAnalyticsData(r0)
            goto L451
        L2f5:
            java.lang.ClassLoader r1 = p185k7.C3767d0.f16553a
            int r1 = r14.readInt()
            if (r1 == 0) goto L2fe
            r2 = 1
        L2fe:
            long r0 = r14.readLong()
            r12.setMeasurementEnabled(r2, r0)
            goto L451
        L307:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L316
            goto L327
        L316:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p185k7.InterfaceC3956r0
            if (r4 == 0) goto L322
            r4 = r3
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L327
        L322:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L327:
            r12.getConditionalUserProperties(r1, r2, r4)
            goto L451
        L32c:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = p185k7.C3767d0.m8366a(r14, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r12.clearConditionalUserProperty(r1, r2, r0)
            goto L451
        L341:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = p185k7.C3767d0.m8366a(r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConditionalUserProperty(r1, r2)
            goto L451
        L352:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.setUserId(r1, r2)
            goto L451
        L35f:
            java.lang.String r1 = r14.readString()
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L36a
            goto L37b
        L36a:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof p185k7.InterfaceC3956r0
            if (r3 == 0) goto L376
            r4 = r2
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L37b
        L376:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L37b:
            r12.getMaxUserProperties(r1, r4)
            goto L451
        L380:
            java.lang.String r1 = r14.readString()
            java.lang.String r5 = r14.readString()
            java.lang.ClassLoader r6 = p185k7.C3767d0.f16553a
            int r6 = r14.readInt()
            if (r6 == 0) goto L391
            r2 = 1
        L391:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L398
            goto L3a9
        L398:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p185k7.InterfaceC3956r0
            if (r4 == 0) goto L3a4
            r4 = r3
            k7.r0 r4 = (p185k7.InterfaceC3956r0) r4
            goto L3a9
        L3a4:
            k7.p0 r4 = new k7.p0
            r4.<init>(r0)
        L3a9:
            r12.getUserProperties(r1, r5, r2, r4)
            goto L451
        L3ae:
            java.lang.String r1 = r14.readString()
            java.lang.String r3 = r14.readString()
            android.os.IBinder r4 = r14.readStrongBinder()
            x6.a r4 = p408x6.InterfaceC6957a.a.m14123x(r4)
            java.lang.ClassLoader r5 = p185k7.C3767d0.f16553a
            int r5 = r14.readInt()
            if (r5 == 0) goto L3c8
            r5 = 1
            goto L3c9
        L3c8:
            r5 = 0
        L3c9:
            long r6 = r14.readLong()
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L451
        L3d7:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = p185k7.C3767d0.m8366a(r14, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r14.readStrongBinder()
            if (r6 != 0) goto L3ee
            goto L3ff
        L3ee:
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p185k7.InterfaceC3956r0
            if (r4 == 0) goto L3f9
            k7.r0 r3 = (p185k7.InterfaceC3956r0) r3
            goto L3fe
        L3f9:
            k7.p0 r3 = new k7.p0
            r3.<init>(r6)
        L3fe:
            r4 = r3
        L3ff:
            long r6 = r14.readLong()
            r0 = r12
            r3 = r5
            r5 = r6
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L451
        L40a:
            java.lang.String r1 = r14.readString()
            java.lang.String r3 = r14.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = p185k7.C3767d0.m8366a(r14, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r14.readInt()
            if (r5 == 0) goto L422
            r5 = 1
            goto L423
        L422:
            r5 = 0
        L423:
            int r6 = r14.readInt()
            if (r6 == 0) goto L42b
            r6 = 1
            goto L42c
        L42b:
            r6 = 0
        L42c:
            long r10 = r14.readLong()
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L451
        L43a:
            android.os.IBinder r1 = r14.readStrongBinder()
            x6.a r1 = p408x6.InterfaceC6957a.a.m14123x(r1)
            android.os.Parcelable$Creator<k7.x0> r2 = p185k7.C4034x0.CREATOR
            android.os.Parcelable r2 = p185k7.C3767d0.m8366a(r14, r2)
            k7.x0 r2 = (p185k7.C4034x0) r2
            long r3 = r14.readLong()
            r12.initialize(r1, r2, r3)
        L451:
            r15.writeNoException()
            return r9
    }
}
