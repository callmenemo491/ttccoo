package p036c6;

/* renamed from: c6.m0 */
/* loaded from: classes.dex */
public final class C0898m0 implements android.os.Parcelable.Creator<p036c6.C0891j> {
    public C0898m0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0891j createFromParcel(android.os.Parcel r24) {
            r23 = this;
            r0 = r24
            int r1 = p270p6.C5368b.m11710t(r24)
            r2 = 0
            r4 = 0
            r5 = 0
            r11 = r2
            r21 = r11
            r8 = r4
            r9 = r8
            r10 = r9
            r15 = r10
            r17 = r15
            r18 = r17
            r19 = r18
            r20 = r19
            r13 = r5
        L1b:
            int r2 = r24.dataPosition()
            if (r2 >= r1) goto L85
            int r2 = r24.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L7b;
                case 3: goto L71;
                case 4: goto L6b;
                case 5: goto L65;
                case 6: goto L5f;
                case 7: goto L59;
                case 8: goto L53;
                case 9: goto L4c;
                case 10: goto L45;
                case 11: goto L3e;
                case 12: goto L37;
                case 13: goto L30;
                default: goto L2c;
            }
        L2c:
            p270p6.C5368b.m11709s(r0, r2)
            goto L1b
        L30:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r21 = r2
            goto L1b
        L37:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r20 = r2
            goto L1b
        L3e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r19 = r2
            goto L1b
        L45:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r18 = r2
            goto L1b
        L4c:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r17 = r2
            goto L1b
        L53:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r4 = r2
            goto L1b
        L59:
            long[] r2 = p270p6.C5368b.m11693c(r0, r2)
            r15 = r2
            goto L1b
        L5f:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r13 = r2
            goto L1b
        L65:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r11 = r2
            goto L1b
        L6b:
            java.lang.Boolean r2 = p270p6.C5368b.m11701k(r0, r2)
            r10 = r2
            goto L1b
        L71:
            android.os.Parcelable$Creator<c6.m> r3 = p036c6.C0897m.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.m r2 = (p036c6.C0897m) r2
            r9 = r2
            goto L1b
        L7b:
            android.os.Parcelable$Creator<com.google.android.gms.cast.MediaInfo> r3 = com.google.android.gms.cast.MediaInfo.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            com.google.android.gms.cast.MediaInfo r2 = (com.google.android.gms.cast.MediaInfo) r2
            r8 = r2
            goto L1b
        L85:
            p270p6.C5368b.m11699i(r0, r1)
            c6.j r0 = new c6.j
            org.json.JSONObject r16 = p123h6.C2487a.m6362a(r4)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0891j[] newArray(int r1) {
            r0 = this;
            c6.j[] r1 = new p036c6.C0891j[r1]
            return r1
    }
}
