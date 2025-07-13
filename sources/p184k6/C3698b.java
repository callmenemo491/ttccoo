package p184k6;

/* renamed from: k6.b */
/* loaded from: classes.dex */
public final class C3698b extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p184k6.C3698b> CREATOR = null;

    /* renamed from: c0 */
    @androidx.annotation.RecentlyNonNull
    public static final p184k6.C3698b f16392c0 = null;

    /* renamed from: Y */
    public final int f16393Y;

    /* renamed from: Z */
    public final int f16394Z;

    /* renamed from: a0 */
    public final android.app.PendingIntent f16395a0;

    /* renamed from: b0 */
    public final java.lang.String f16396b0;

    static {
            k6.b r0 = new k6.b
            r1 = 0
            r0.<init>(r1)
            p184k6.C3698b.f16392c0 = r0
            k6.k r0 = new k6.k
            r0.<init>()
            p184k6.C3698b.CREATOR = r0
            return
    }

    public C3698b(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f16393Y = r0
            r1.f16394Z = r2
            r2 = 0
            r1.f16395a0 = r2
            r1.f16396b0 = r2
            return
    }

    public C3698b(int r1, int r2, android.app.PendingIntent r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f16393Y = r1
            r0.f16394Z = r2
            r0.f16395a0 = r3
            r0.f16396b0 = r4
            return
    }

    public C3698b(int r2, android.app.PendingIntent r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f16393Y = r0
            r1.f16394Z = r2
            r1.f16395a0 = r3
            r2 = 0
            r1.f16396b0 = r2
            return
    }

    /* renamed from: Y */
    public static java.lang.String m8160Y(int r2) {
            r0 = 99
            if (r2 == r0) goto L72
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r2 == r0) goto L6f
            switch(r2) {
                case -1: goto L6c;
                case 0: goto L69;
                case 1: goto L66;
                case 2: goto L63;
                case 3: goto L60;
                case 4: goto L5d;
                case 5: goto L5a;
                case 6: goto L57;
                case 7: goto L54;
                case 8: goto L51;
                case 9: goto L4e;
                case 10: goto L4b;
                case 11: goto L48;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 13: goto L45;
                case 14: goto L42;
                case 15: goto L3f;
                case 16: goto L3c;
                case 17: goto L39;
                case 18: goto L36;
                case 19: goto L33;
                case 20: goto L30;
                case 21: goto L2d;
                case 22: goto L2a;
                case 23: goto L27;
                default: goto Le;
            }
        Le:
            r0 = 31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "UNKNOWN_ERROR_CODE("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
        L27:
            java.lang.String r2 = "API_DISABLED"
            return r2
        L2a:
            java.lang.String r2 = "RESOLUTION_ACTIVITY_NOT_FOUND"
            return r2
        L2d:
            java.lang.String r2 = "API_VERSION_UPDATE_REQUIRED"
            return r2
        L30:
            java.lang.String r2 = "RESTRICTED_PROFILE"
            return r2
        L33:
            java.lang.String r2 = "SERVICE_MISSING_PERMISSION"
            return r2
        L36:
            java.lang.String r2 = "SERVICE_UPDATING"
            return r2
        L39:
            java.lang.String r2 = "SIGN_IN_FAILED"
            return r2
        L3c:
            java.lang.String r2 = "API_UNAVAILABLE"
            return r2
        L3f:
            java.lang.String r2 = "INTERRUPTED"
            return r2
        L42:
            java.lang.String r2 = "TIMEOUT"
            return r2
        L45:
            java.lang.String r2 = "CANCELED"
            return r2
        L48:
            java.lang.String r2 = "LICENSE_CHECK_FAILED"
            return r2
        L4b:
            java.lang.String r2 = "DEVELOPER_ERROR"
            return r2
        L4e:
            java.lang.String r2 = "SERVICE_INVALID"
            return r2
        L51:
            java.lang.String r2 = "INTERNAL_ERROR"
            return r2
        L54:
            java.lang.String r2 = "NETWORK_ERROR"
            return r2
        L57:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            return r2
        L5a:
            java.lang.String r2 = "INVALID_ACCOUNT"
            return r2
        L5d:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            return r2
        L60:
            java.lang.String r2 = "SERVICE_DISABLED"
            return r2
        L63:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            return r2
        L66:
            java.lang.String r2 = "SERVICE_MISSING"
            return r2
        L69:
            java.lang.String r2 = "SUCCESS"
            return r2
        L6c:
            java.lang.String r2 = "UNKNOWN"
            return r2
        L6f:
            java.lang.String r2 = "DRIVE_EXTERNAL_STORAGE_REQUIRED"
            return r2
        L72:
            java.lang.String r2 = "UNFINISHED"
            return r2
    }

    /* renamed from: X */
    public final boolean m8161X() {
            r1 = this;
            int r0 = r1.f16394Z
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p184k6.C3698b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k6.b r5 = (p184k6.C3698b) r5
            int r1 = r4.f16394Z
            int r3 = r5.f16394Z
            if (r1 != r3) goto L27
            android.app.PendingIntent r1 = r4.f16395a0
            android.app.PendingIntent r3 = r5.f16395a0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L27
            java.lang.String r1 = r4.f16396b0
            java.lang.String r5 = r5.f16396b0
            boolean r5 = p248o6.C4924o.m11074a(r1, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f16394Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            android.app.PendingIntent r1 = r3.f16395a0
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.f16396b0
            r2 = 2
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public final java.lang.String toString() {
            r3 = this;
            o6.o$a r0 = new o6.o$a
            r1 = 0
            r0.<init>(r3, r1)
            int r1 = r3.f16394Z
            java.lang.String r1 = m8160Y(r1)
            java.lang.String r2 = "statusCode"
            r0.m11075a(r2, r1)
            android.app.PendingIntent r1 = r3.f16395a0
            java.lang.String r2 = "resolution"
            r0.m11075a(r2, r1)
            java.lang.String r1 = r3.f16396b0
            java.lang.String r2 = "message"
            r0.m11075a(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            int r1 = r5.f16393Y
            r2 = 1
            r3 = 4
            p270p6.C5369c.m11724l(r6, r2, r3)
            r6.writeInt(r1)
            int r1 = r5.f16394Z
            r2 = 2
            p270p6.C5369c.m11724l(r6, r2, r3)
            r6.writeInt(r1)
            android.app.PendingIntent r1 = r5.f16395a0
            r2 = 3
            r4 = 0
            p270p6.C5369c.m11718f(r6, r2, r1, r7, r4)
            java.lang.String r7 = r5.f16396b0
            p270p6.C5369c.m11719g(r6, r3, r7, r4)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
