package p036c6;

/* renamed from: c6.x0 */
/* loaded from: classes.dex */
public final class C0920x0 implements android.os.Parcelable.Creator<p036c6.C0907r> {
    public C0920x0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0907r createFromParcel(android.os.Parcel r19) {
            r18 = this;
            r0 = r19
            int r1 = p270p6.C5368b.m11710t(r19)
            r2 = 0
            r3 = 0
            r4 = 0
            r14 = r2
            r17 = r14
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
        L17:
            int r2 = r19.dataPosition()
            if (r2 >= r1) goto L76
            int r2 = r19.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L70;
                case 3: goto L6a;
                case 4: goto L64;
                case 5: goto L5e;
                case 6: goto L58;
                case 7: goto L52;
                case 8: goto L4c;
                case 9: goto L46;
                case 10: goto L40;
                case 11: goto L3a;
                case 12: goto L33;
                case 13: goto L2c;
                default: goto L28;
            }
        L28:
            p270p6.C5368b.m11709s(r0, r2)
            goto L17
        L2c:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r17 = r2
            goto L17
        L33:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r16 = r2
            goto L17
        L3a:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r15 = r2
            goto L17
        L40:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r14 = r2
            goto L17
        L46:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r13 = r2
            goto L17
        L4c:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r12 = r2
            goto L17
        L52:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r11 = r2
            goto L17
        L58:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r10 = r2
            goto L17
        L5e:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r9 = r2
            goto L17
        L64:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r8 = r2
            goto L17
        L6a:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r7 = r2
            goto L17
        L70:
            float r2 = p270p6.C5368b.m11703m(r0, r2)
            r6 = r2
            goto L17
        L76:
            p270p6.C5368b.m11699i(r0, r1)
            c6.r r0 = new c6.r
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0907r[] newArray(int r1) {
            r0 = this;
            c6.r[] r1 = new p036c6.C0907r[r1]
            return r1
    }
}
