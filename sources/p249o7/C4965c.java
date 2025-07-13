package p249o7;

/* renamed from: o7.c */
/* loaded from: classes.dex */
public final class C4965c implements android.os.Parcelable.Creator<p249o7.C4957b> {
    public C4965c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p249o7.C4957b createFromParcel(android.os.Parcel r22) {
            r21 = this;
            r0 = r22
            int r1 = p270p6.C5368b.m11710t(r22)
            r2 = 0
            r4 = 0
            r5 = 0
            r10 = r2
            r15 = r10
            r18 = r15
            r7 = r4
            r8 = r7
            r9 = r8
            r13 = r9
            r14 = r13
            r17 = r14
            r20 = r17
            r12 = 0
        L18:
            int r2 = r22.dataPosition()
            if (r2 >= r1) goto L82
            int r2 = r22.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L7c;
                case 3: goto L76;
                case 4: goto L6c;
                case 5: goto L66;
                case 6: goto L60;
                case 7: goto L5a;
                case 8: goto L50;
                case 9: goto L4a;
                case 10: goto L3f;
                case 11: goto L38;
                case 12: goto L2d;
                default: goto L29;
            }
        L29:
            p270p6.C5368b.m11709s(r0, r2)
            goto L18
        L2d:
            android.os.Parcelable$Creator<o7.q> r3 = p249o7.C5077q.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            o7.q r2 = (p249o7.C5077q) r2
            r20 = r2
            goto L18
        L38:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r18 = r2
            goto L18
        L3f:
            android.os.Parcelable$Creator<o7.q> r3 = p249o7.C5077q.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            o7.q r2 = (p249o7.C5077q) r2
            r17 = r2
            goto L18
        L4a:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r15 = r2
            goto L18
        L50:
            android.os.Parcelable$Creator<o7.q> r3 = p249o7.C5077q.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            o7.q r2 = (p249o7.C5077q) r2
            r14 = r2
            goto L18
        L5a:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r13 = r2
            goto L18
        L60:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r12 = r2
            goto L18
        L66:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r10 = r2
            goto L18
        L6c:
            android.os.Parcelable$Creator<o7.p6> r3 = p249o7.C5076p6.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            o7.p6 r2 = (p249o7.C5076p6) r2
            r9 = r2
            goto L18
        L76:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r8 = r2
            goto L18
        L7c:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L18
        L82:
            p270p6.C5368b.m11699i(r0, r1)
            o7.b r0 = new o7.b
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r20)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p249o7.C4957b[] newArray(int r1) {
            r0 = this;
            o7.b[] r1 = new p249o7.C4957b[r1]
            return r1
    }
}
