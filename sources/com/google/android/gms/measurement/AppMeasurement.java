package com.google.android.gms.measurement;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile com.google.android.gms.measurement.AppMeasurement f5651b;

    /* renamed from: a */
    public final p219m7.AbstractC4416c f5652a;

    public static class ConditionalUserProperty {

        @androidx.annotation.Keep
        public boolean mActive;

        @androidx.annotation.Keep
        public java.lang.String mAppId;

        @androidx.annotation.Keep
        public long mCreationTimestamp;

        @androidx.annotation.Keep
        public java.lang.String mExpiredEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mExpiredEventParams;

        @androidx.annotation.Keep
        public java.lang.String mName;

        @androidx.annotation.Keep
        public java.lang.String mOrigin;

        @androidx.annotation.Keep
        public long mTimeToLive;

        @androidx.annotation.Keep
        public java.lang.String mTimedOutEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mTimedOutEventParams;

        @androidx.annotation.Keep
        public java.lang.String mTriggerEventName;

        @androidx.annotation.Keep
        public long mTriggerTimeout;

        @androidx.annotation.Keep
        public java.lang.String mTriggeredEventName;

        @androidx.annotation.Keep
        public android.os.Bundle mTriggeredEventParams;

        @androidx.annotation.Keep
        public long mTriggeredTimestamp;

        @androidx.annotation.Keep
        public java.lang.Object mValue;

        public ConditionalUserProperty() {
                r0 = this;
                r0.<init>()
                return
        }

        public ConditionalUserProperty(android.os.Bundle r7) {
                r6 = this;
                java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r6.<init>()
                java.lang.String r2 = "null reference"
                java.util.Objects.requireNonNull(r7, r2)
                java.lang.String r2 = "app_id"
                r3 = 0
                java.lang.Object r2 = p124h7.C2939x3.m7292r(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mAppId = r2
                java.lang.String r2 = "origin"
                java.lang.Object r2 = p124h7.C2939x3.m7292r(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mOrigin = r2
                java.lang.String r2 = "name"
                java.lang.Object r2 = p124h7.C2939x3.m7292r(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mName = r2
                java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                java.lang.String r4 = "value"
                java.lang.Object r2 = p124h7.C2939x3.m7292r(r7, r4, r2, r3)
                r6.mValue = r2
                java.lang.String r2 = "trigger_event_name"
                java.lang.Object r2 = p124h7.C2939x3.m7292r(r7, r2, r1, r3)
                java.lang.String r2 = (java.lang.String) r2
                r6.mTriggerEventName = r2
                r4 = 0
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                java.lang.String r4 = "trigger_timeout"
                java.lang.Object r4 = p124h7.C2939x3.m7292r(r7, r4, r0, r2)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r6.mTriggerTimeout = r4
                java.lang.String r4 = "timed_out_event_name"
                java.lang.Object r4 = p124h7.C2939x3.m7292r(r7, r4, r1, r3)
                java.lang.String r4 = (java.lang.String) r4
                r6.mTimedOutEventName = r4
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                java.lang.String r5 = "timed_out_event_params"
                java.lang.Object r4 = p124h7.C2939x3.m7292r(r7, r5, r4, r3)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r6.mTimedOutEventParams = r4
                java.lang.String r4 = "triggered_event_name"
                java.lang.Object r4 = p124h7.C2939x3.m7292r(r7, r4, r1, r3)
                java.lang.String r4 = (java.lang.String) r4
                r6.mTriggeredEventName = r4
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                java.lang.String r5 = "triggered_event_params"
                java.lang.Object r4 = p124h7.C2939x3.m7292r(r7, r5, r4, r3)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r6.mTriggeredEventParams = r4
                java.lang.String r4 = "time_to_live"
                java.lang.Object r4 = p124h7.C2939x3.m7292r(r7, r4, r0, r2)
                java.lang.Long r4 = (java.lang.Long) r4
                long r4 = r4.longValue()
                r6.mTimeToLive = r4
                java.lang.String r4 = "expired_event_name"
                java.lang.Object r1 = p124h7.C2939x3.m7292r(r7, r4, r1, r3)
                java.lang.String r1 = (java.lang.String) r1
                r6.mExpiredEventName = r1
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                java.lang.String r4 = "expired_event_params"
                java.lang.Object r1 = p124h7.C2939x3.m7292r(r7, r4, r1, r3)
                android.os.Bundle r1 = (android.os.Bundle) r1
                r6.mExpiredEventParams = r1
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                java.lang.String r4 = "active"
                java.lang.Object r1 = p124h7.C2939x3.m7292r(r7, r4, r1, r3)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r6.mActive = r1
                java.lang.String r1 = "creation_timestamp"
                java.lang.Object r1 = p124h7.C2939x3.m7292r(r7, r1, r0, r2)
                java.lang.Long r1 = (java.lang.Long) r1
                long r3 = r1.longValue()
                r6.mCreationTimestamp = r3
                java.lang.String r1 = "triggered_timestamp"
                java.lang.Object r7 = p124h7.C2939x3.m7292r(r7, r1, r0, r2)
                java.lang.Long r7 = (java.lang.Long) r7
                long r0 = r7.longValue()
                r6.mTriggeredTimestamp = r0
                return
        }
    }

    public AppMeasurement(com.google.android.gms.measurement.internal.C1113d r2) {
            r1 = this;
            r1.<init>()
            m7.a r0 = new m7.a
            r0.<init>(r2)
            r1.f5652a = r0
            return
    }

    public AppMeasurement(p249o7.InterfaceC4987e5 r2) {
            r1 = this;
            r1.<init>()
            m7.b r0 = new m7.b
            r0.<init>(r2)
            r1.f5652a = r0
            return
    }

    @androidx.annotation.Keep
    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
            com.google.android.gms.measurement.AppMeasurement r0 = com.google.android.gms.measurement.AppMeasurement.f5651b
            if (r0 != 0) goto L59
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = com.google.android.gms.measurement.AppMeasurement.f5651b     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L54
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L56
            r3[r6] = r14     // Catch: java.lang.Throwable -> L56
            r3[r7] = r1     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L56
            o7.e5 r2 = (p249o7.InterfaceC4987e5) r2     // Catch: java.lang.Throwable -> L56
            goto L2f
        L2e:
            r2 = r1
        L2f:
            if (r2 == 0) goto L39
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f5651b = r14     // Catch: java.lang.Throwable -> L56
            goto L54
        L39:
            k7.x0 r13 = new k7.x0     // Catch: java.lang.Throwable -> L56
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.internal.d r14 = com.google.android.gms.measurement.internal.C1113d.m3157u(r14, r13, r1)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch: java.lang.Throwable -> L56
            r1.<init>(r14)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.measurement.AppMeasurement.f5651b = r1     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L59
        L56:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r14
        L59:
            com.google.android.gms.measurement.AppMeasurement r14 = com.google.android.gms.measurement.AppMeasurement.f5651b
            return r14
    }

    @androidx.annotation.Keep
    public void beginAdUnitExposure(java.lang.String r2) {
            r1 = this;
            m7.c r0 = r1.f5652a
            r0.mo9838a(r2)
            return
    }

    @androidx.annotation.Keep
    public void clearConditionalUserProperty(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            m7.c r0 = r1.f5652a
            r0.mo9840c(r2, r3, r4)
            return
    }

    @androidx.annotation.Keep
    public void endAdUnitExposure(java.lang.String r2) {
            r1 = this;
            m7.c r0 = r1.f5652a
            r0.mo9845h(r2)
            return
    }

    @androidx.annotation.Keep
    public long generateEventId() {
            r2 = this;
            m7.c r0 = r2.f5652a
            long r0 = r0.mo9839b()
            return r0
    }

    @androidx.annotation.Keep
    public java.lang.String getAppInstanceId() {
            r1 = this;
            m7.c r0 = r1.f5652a
            java.lang.String r0 = r0.mo9844g()
            return r0
    }

    @androidx.annotation.Keep
    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            m7.c r0 = r2.f5652a
            java.util.List r3 = r0.mo9841d(r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            if (r3 != 0) goto Lc
            r0 = 0
            goto L10
        Lc:
            int r0 = r3.size()
        L10:
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty r1 = new com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty
            r1.<init>(r0)
            r4.add(r1)
            goto L17
        L2c:
            return r4
    }

    @androidx.annotation.Keep
    public java.lang.String getCurrentScreenClass() {
            r1 = this;
            m7.c r0 = r1.f5652a
            java.lang.String r0 = r0.mo9846i()
            return r0
    }

    @androidx.annotation.Keep
    public java.lang.String getCurrentScreenName() {
            r1 = this;
            m7.c r0 = r1.f5652a
            java.lang.String r0 = r0.mo9849r()
            return r0
    }

    @androidx.annotation.Keep
    public java.lang.String getGmpAppId() {
            r1 = this;
            m7.c r0 = r1.f5652a
            java.lang.String r0 = r0.mo9850s()
            return r0
    }

    @androidx.annotation.Keep
    public int getMaxUserProperties(java.lang.String r2) {
            r1 = this;
            m7.c r0 = r1.f5652a
            int r2 = r0.mo9842e(r2)
            return r2
    }

    @androidx.annotation.Keep
    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String r2, java.lang.String r3, boolean r4) {
            r1 = this;
            m7.c r0 = r1.f5652a
            java.util.Map r2 = r0.mo9843f(r2, r3, r4)
            return r2
    }

    @androidx.annotation.Keep
    public void logEventInternal(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            m7.c r0 = r1.f5652a
            r0.mo9848k(r2, r3, r4)
            return
    }

    @androidx.annotation.Keep
    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty r6) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            m7.c r0 = r5.f5652a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r6.mAppId
            if (r2 == 0) goto L15
            java.lang.String r3 = "app_id"
            r1.putString(r3, r2)
        L15:
            java.lang.String r2 = r6.mOrigin
            if (r2 == 0) goto L1e
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        L1e:
            java.lang.String r2 = r6.mName
            if (r2 == 0) goto L27
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        L27:
            java.lang.Object r2 = r6.mValue
            if (r2 == 0) goto L2e
            p124h7.C2939x3.m7298x(r1, r2)
        L2e:
            java.lang.String r2 = r6.mTriggerEventName
            if (r2 == 0) goto L37
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        L37:
            long r2 = r6.mTriggerTimeout
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r6.mTimedOutEventName
            if (r2 == 0) goto L47
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        L47:
            android.os.Bundle r2 = r6.mTimedOutEventParams
            if (r2 == 0) goto L50
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        L50:
            java.lang.String r2 = r6.mTriggeredEventName
            if (r2 == 0) goto L59
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L59:
            android.os.Bundle r2 = r6.mTriggeredEventParams
            if (r2 == 0) goto L62
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L62:
            long r2 = r6.mTimeToLive
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r6.mExpiredEventName
            if (r2 == 0) goto L72
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L72:
            android.os.Bundle r2 = r6.mExpiredEventParams
            if (r2 == 0) goto L7b
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L7b:
            long r2 = r6.mCreationTimestamp
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r6.mActive
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r6.mTriggeredTimestamp
            java.lang.String r6 = "triggered_timestamp"
            r1.putLong(r6, r2)
            r0.mo9847j(r1)
            return
    }
}
